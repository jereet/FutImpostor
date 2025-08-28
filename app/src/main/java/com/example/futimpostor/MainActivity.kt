package com.example.futimpostor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.futimpostor.ui.*
import com.example.futimpostor.ui.theme.FutImpostorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FutImpostorTheme {
                FutImpostorApp()
            }
        }

    }
}

@Composable
fun FutImpostorApp() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "home"
    ) {
        composable("home") {
            HomeScreen(navController)
        }
        composable("create_room") {
            CreateRoomScreen(navController)
        }
        composable("join_room") {
            JoinRoomScreen(navController)
        }
        composable("game") {
            GameScreen(navController)
        }
        composable("lobby") {
            LobbyScreen(navController)
        }
        composable("result") {
            ResultScreen(navController)
        }

    }
}
