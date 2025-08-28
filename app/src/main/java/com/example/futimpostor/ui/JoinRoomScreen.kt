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
fun JoinRoomScreen(navController: NavHostController) {
    var code by remember { mutableStateOf("") }

    Scaffold(
        topBar = { TopAppBar(title = { Text("Unirse a Sala") }) }
    ) { padding ->
        Column(
            modifier = Modifier
                .padding(padding)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                value = code,
                onValueChange = { code = it },
                label = { Text("Código de sala") }
            )
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.navigate("lobby") }) {
                Text("Unirse")
            }
        }
    }
}

