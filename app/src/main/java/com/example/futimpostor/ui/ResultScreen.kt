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
fun ResultScreen(navController: NavHostController) {
    Scaffold(
        topBar = { TopAppBar(title = { Text("Resultado") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text("El impostor era:")
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("lobby") }) {
                Text("Volver a jugar")
            }
        }
    }
}
