package io.aayush.tantra.ui.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import io.aayush.tantra.R

sealed class Screen (val route: String, @StringRes val title: Int, @DrawableRes val icon: Int) {

    data object Devices : Screen(
        route = "devices_screen",
        title = R.string.devices,
        icon = R.drawable.ic_bluetooth_searching
    )

    data object Message : Screen(
        route = "message_screen",
        title = R.string.message,
        icon = R.drawable.ic_chat
    )
}
