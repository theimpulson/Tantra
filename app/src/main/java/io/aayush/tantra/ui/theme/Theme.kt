package io.aayush.tantra.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.platform.LocalContext
import io.aayush.tantra.ui.components.rememberSystemUiController

@Composable
fun TantraTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.S) {
        if (darkTheme) {
            dynamicDarkColorScheme(LocalContext.current)
        } else {
            dynamicLightColorScheme(LocalContext.current)
        }
    } else {
        if (darkTheme) darkColorScheme() else lightColorScheme()
    }

    val systemUiController = rememberSystemUiController()
    LaunchedEffect(key1 = Unit) {
        systemUiController.setSystemBarsColor(colors.background, darkIcons = !darkTheme)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O_MR1) {
            systemUiController.setNavigationBarColor(colors.background, !darkTheme)
        }
    }

    MaterialTheme(colorScheme = colors, typography = Typography(), content = content)
}
