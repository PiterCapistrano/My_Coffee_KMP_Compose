package org.pitercapistrano.mycoffee.view

import androidx.compose.foundation.background
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun Splash(navController: NavController){
    Scaffold(
        modifier = Modifier.background(
            color = listOf(

            )
        )
    ) {
        CircularProgressIndicator()
    }
}