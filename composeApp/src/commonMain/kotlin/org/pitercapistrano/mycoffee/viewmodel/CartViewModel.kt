package org.pitercapistrano.mycoffee.viewmodel

import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject
import org.pitercapistrano.mycoffee.model.Cart
import org.pitercapistrano.mycoffee.model.Produto
import org.pitercapistrano.mycoffee.repository.CartRepository

class CartViewModel : ViewModel(), KoinComponent {

    private val cartRepositorio: CartRepository by inject()
    var produtosCart = mutableStateListOf<Cart>()
    var totalItens = mutableIntStateOf(0)

    fun getProdutos(response: (MutableList<Produto>) -> Unit) {
        viewModelScope.launch {
            response(cartRepositorio.getProdutos().toMutableList())
        }
    }

    fun adicionarProdutoCart(produto: Cart) {
        produtosCart.add(produto)
        totalItens.intValue += 1
    }

    fun removerProdutoCart(produto: Cart) {
        produtosCart.remove(produto)
        totalItens.intValue -= 1
    }

    fun calcularTotal(): Double {
        return produtosCart.sumOf { it.preco.toDouble() }
    }
}