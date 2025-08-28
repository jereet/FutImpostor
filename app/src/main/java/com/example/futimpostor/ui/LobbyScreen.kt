package com.example.futimpostor.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LobbyScreen(navController: NavHostController) {
    val players = listOf("Jugador 1", "Jugador 2", "Jugador 3", "Jugador 4")

    Scaffold(
        topBar = { TopAppBar(title = { Text("Sala de Espera") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("Jugadores en la sala:")
            Spacer(modifier = Modifier.height(8.dp))
            players.forEach {
                Text(it)
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("game") }) {
                Text("Iniciar Juego")
            }
        }
    }
}
