package io.aayush.tantra

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.rememberNavController
import dagger.hilt.android.AndroidEntryPoint
import io.aayush.tantra.ui.navigation.SetupNavGraph
import io.aayush.tantra.ui.theme.TantraTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TantraTheme {
                val navController = rememberNavController()

                Scaffold {
                    SetupNavGraph(navHostController = navController, paddingValues = it)
                }
            }
        }
    }
}

