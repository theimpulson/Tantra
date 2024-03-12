package io.aayush.tantra.ui.navigation

import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import io.aayush.tantra.ui.screens.devices.DevicesScreen
import io.aayush.tantra.ui.screens.message.MessageScreen

@Composable
fun SetupNavGraph(
    navHostController: NavHostController,
    paddingValues: PaddingValues,
    startDestinationRoute: String = Screen.Devices.route
) {
    NavHost(
        navController = navHostController,
        startDestination = startDestinationRoute,
        modifier = Modifier.padding(paddingValues),
        enterTransition = { EnterTransition.None },
        exitTransition = { ExitTransition.None }
    ) {
        composable(route = Screen.Devices.route) { DevicesScreen(navHostController) }
        composable(route = Screen.Message.route) { MessageScreen(navHostController) }
    }
}
