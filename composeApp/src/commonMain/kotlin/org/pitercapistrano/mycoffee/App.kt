package org.pitercapistrano.mycoffee

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

import mycoffee.composeapp.generated.resources.Res
import mycoffee.composeapp.generated.resources.compose_multiplatform
import org.koin.compose.viewmodel.koinViewModel
import org.pitercapistrano.mycoffee.view.Cart
import org.pitercapistrano.mycoffee.view.Home
import org.pitercapistrano.mycoffee.view.Pagamento
import org.pitercapistrano.mycoffee.view.SignIn
import org.pitercapistrano.mycoffee.view.SignUp
import org.pitercapistrano.mycoffee.view.Splash
import org.pitercapistrano.mycoffee.viewmodel.CartViewModel

@Composable
@Preview
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        val cartViewModel: CartViewModel = koinViewModel()

        NavHost(navController, startDestination = "splash"){

            composable(route = "splash"){
                Splash(navController)
            }
            composable(route = "signIn"){
                SignIn(navController)
            }
            composable(route = "signUp"){
                SignUp(navController)
            }
            composable(route = "home"){
                Home(navController, cartViewModel)
            }
            composable(route = "cart"){
                Cart(navController, cartViewModel)
            }
            composable(route = "pagamento"){
                Pagamento(cartViewModel)
            }
        }

    }
}