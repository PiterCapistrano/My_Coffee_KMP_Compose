package org.pitercapistrano.mycoffee

import androidx.compose.ui.platform.LocalContext
import androidx.compose.runtime.Composable

@Composable
actual fun getPlatformContext(): Any {
    return LocalContext.current
}