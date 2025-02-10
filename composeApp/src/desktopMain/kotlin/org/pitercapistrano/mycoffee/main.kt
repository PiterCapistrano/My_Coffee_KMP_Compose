package org.pitercapistrano.mycoffee

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.pitercapistrano.mycoffee.app.App

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MyCoffee",
    ) {
        App()
    }
}