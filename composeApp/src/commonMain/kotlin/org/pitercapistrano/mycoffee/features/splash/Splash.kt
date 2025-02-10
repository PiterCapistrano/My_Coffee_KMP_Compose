package org.pitercapistrano.mycoffee.features.splash

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kotlinx.coroutines.delay
import org.pitercapistrano.mycoffee.app.Route
import org.pitercapistrano.mycoffee.ui.theme.Brown400
import org.pitercapistrano.mycoffee.ui.theme.Brown500
import org.pitercapistrano.mycoffee.ui.theme.Typography
import org.pitercapistrano.mycoffee.ui.theme.White

@Composable
fun Splash(navController: NavController) {
    // Aguarda 2 segundos e navega para SignIn
    LaunchedEffect(Unit) {
        delay(2000) // Espera 2 segundos
        navController.navigate(Route.SignIn) {
            popUpTo(Route.Splash) { inclusive = true } // Remove Splash da pilha de navegação

        }
    }

    SplashContent()
}

@Composable
fun SplashContent() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        Brown400,
                        Brown500,
                    )
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Text(
                text = "My Coffee",
                style = Typography.titleLarge.copy(color = White)
            )
            Spacer(modifier = Modifier.height(16.dp))
            CircularProgressIndicator(
                color = White
            )
        }
    }
}