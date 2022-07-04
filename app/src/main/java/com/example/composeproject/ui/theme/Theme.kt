package com.example.composeproject.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color.Companion.White


private val LightColorPalette = lightColors(
    primary = Blue700,
    primaryVariant = Blue900,
    onPrimary = White,
    secondary = Blue700,
    secondaryVariant = Blue900,
    onSecondary = White,
    error = Blue800,
    onBackground = White
)

private val DarkColorPalette = darkColors(
    primary = Blue300,
    primaryVariant = Blue700,
    onPrimary = White,
    secondary = Blue300,
    onSecondary = White,
    error = Blue200,
    onBackground = White
)

@Composable
fun GoodNewsTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    MaterialTheme(
        colors = if (darkTheme) DarkColorPalette else LightColorPalette,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}
