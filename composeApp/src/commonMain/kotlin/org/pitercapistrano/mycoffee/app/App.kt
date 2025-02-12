package org.pitercapistrano.mycoffee.app

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.auth.auth
import org.pitercapistrano.mycoffee.features.cart.Cart
import org.pitercapistrano.mycoffee.features.home.Home
import org.pitercapistrano.mycoffee.features.payment.Payment
import org.pitercapistrano.mycoffee.features.sign_in.SignIn
import org.pitercapistrano.mycoffee.features.sign_up.SignUp
import org.pitercapistrano.mycoffee.features.splash.Splash
import org.pitercapistrano.mycoffee.services.auth.AuthServiceImpl
import org.pitercapistrano.mycoffee.viewmodel.AuthViewModel

@Composable
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        val authViewModel= AuthViewModel(AuthServiceImpl(auth = Firebase.auth))


        NavHost(
            navController = navController,
            startDestination = Route.Splash // Inicia na tela Splash
        ) {
            composable<Route.Splash> {
                Splash(navController)
            }
            composable<Route.SignIn> {
                SignIn(navController, authViewModel,)
            }
            composable<Route.SignUp> {
                SignUp(navController)
            }
            composable<Route.Home> {
                Home(navController)
            }
            composable<Route.Cart> {
                Cart(navController)
            }
            composable<Route.Payment> {
                Payment(navController)
            }
        }
    }
}
