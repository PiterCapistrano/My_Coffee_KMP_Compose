package org.pitercapistrano.mycoffee.ui.theme


import androidx.compose.runtime.Composable
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

private val LightTheme = lightColorScheme(
    primary = Brown400,
    secondary = White,
    tertiary = Brown500
)

private val DarkTheme = darkColorScheme(
    primary = Brown400,
    secondary = White,
    tertiary = Brown500
)

@Composable
fun MyTheme(
    theme: String,
    content: @Composable () -> Unit,
){
    val colorSheme = when{
        theme == "1" -> LightTheme
        else -> DarkTheme
    }

    MaterialTheme(
        colorScheme = colorSheme,
        typography = Typography,
        content = content
    )
}