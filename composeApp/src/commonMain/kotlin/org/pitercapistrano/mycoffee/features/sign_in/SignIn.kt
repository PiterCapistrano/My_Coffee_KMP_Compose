package org.pitercapistrano.mycoffee.features.sign_in

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalGraphicsContext
import androidx.navigation.NavController
import mycoffee.composeapp.generated.resources.Res
import mycoffee.composeapp.generated.resources.visibility_off
import mycoffee.composeapp.generated.resources.visibility_on
import org.jetbrains.compose.resources.painterResource
import org.pitercapistrano.mycoffee.getPlatformContext
import org.pitercapistrano.mycoffee.ui.theme.Typography

@Composable
fun SignIn(navController: NavController){

    var email by remember {
        mutableStateOf("")
    }

    var password by remember {
        mutableStateOf("")
    }

    var passwordVisibility by remember {
        mutableStateOf(false)
    }

    var message by remember {
        mutableStateOf("")
    }

    val icon = if (passwordVisibility) {
        painterResource(Res.drawable.visibility_off)
    }else{
        painterResource(Res.drawable.visibility_on)
    }

    val context = getPlatformContext()

    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Welcome to My Coffee", style = Typography.titleLarge)
        }
    }
}