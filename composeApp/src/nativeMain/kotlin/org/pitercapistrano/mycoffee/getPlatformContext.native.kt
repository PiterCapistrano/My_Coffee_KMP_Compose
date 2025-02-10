package org.pitercapistrano.mycoffee

import androidx.compose.runtime.Composable
import platform.UIKit.UIApplication
import platform.UIKit.UIViewController

@Composable
actual fun getPlatformContext(): Any {
    return UIApplication.sharedApplication.keyWindow?.rootViewController ?: UIViewController()
}