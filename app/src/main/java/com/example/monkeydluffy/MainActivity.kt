package com.example.monkeydluffy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.example.monkeydluffy.detail.DetailScreen
import com.example.monkeydluffy.home.HomeScreen
import com.example.monkeydluffy.info.InfoDeskScreen
import com.example.monkeydluffy.nav.NavHostController
import com.example.monkeydluffy.ui.theme.MonkeyDLuffyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MonkeyDLuffyTheme {
//                HomeScreen()
//                InfoDeskScreen()
//                DetailScreen()
                val navController = rememberNavController()
                NavHostController(navController)
            }
        }
    }
}
