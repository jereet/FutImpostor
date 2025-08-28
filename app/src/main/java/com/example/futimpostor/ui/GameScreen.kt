package com.example.futimpostor.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameScreen(navController: NavHostController) {
    val players = listOf("Messi", "Neymar", "Suárez", "Cristiano")
    val player = players.random()

    Scaffold(
        topBar = { TopAppBar(title = { Text("Juego en curso") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Jugador: $player")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("result") }) {
                Text("Finalizar Ronda")
            }
        }
    }
}
