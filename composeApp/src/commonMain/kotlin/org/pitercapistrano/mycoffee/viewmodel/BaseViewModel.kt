package org.pitercapistrano.mycoffee.viewmodel

import dev.icerock.moko.mvvm.viewmodel.ViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch

open class BaseViewModel() : ViewModel() {

    val cotoutineContext = SupervisorJob() + CoroutineExceptionHandler{_, throwable ->
        println("BaseViewModel: Error: ${throwable.message}")
    }

    private var job: Job? = null

    fun launchWithCatchingException(block: suspend CoroutineScope.() -> Unit) {
        job =viewModelScope.launch (
            context = cotoutineContext,
            block = block
        )
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }
}