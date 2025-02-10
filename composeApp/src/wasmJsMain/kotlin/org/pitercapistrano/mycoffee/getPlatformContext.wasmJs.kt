package org.pitercapistrano.mycoffee

import androidx.compose.runtime.Composable
import kotlinx.browser.window

@Composable
actual fun getPlatformContext(): Any {
    return window
}