package org.pitercapistrano.mycoffee

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import dev.gitlive.firebase.Firebase
import dev.gitlive.firebase.FirebaseOptions
import dev.gitlive.firebase.initialize
import org.pitercapistrano.mycoffee.app.App

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Firebase.initialize(
            applicationContext,
            options = FirebaseOptions(
                applicationId = "1:869865895245:android:22fac79b016d619e5e3304",
                apiKey = "AIzaSyDx274-_PqdVJ4qkTKuWlcquFEpQT7oAd0",
                projectId = "mycoffee-2f755"
            )
        )


        setContent {
            App()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    App()
}