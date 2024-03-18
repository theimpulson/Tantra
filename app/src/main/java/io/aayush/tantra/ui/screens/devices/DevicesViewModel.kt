package io.aayush.tantra.ui.screens.devices

import android.bluetooth.BluetoothManager
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class DevicesViewModel @Inject constructor(
    val bluetoothManager: BluetoothManager
): ViewModel() {
}
