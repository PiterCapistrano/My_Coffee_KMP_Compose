package org.pitercapistrano.mycoffee

import androidx.compose.runtime.Composable

@Composable
actual fun getPlatformContext(): Any {
    return "Desktop Context" // Pode ser algo diferente dependendo da necessidade
}