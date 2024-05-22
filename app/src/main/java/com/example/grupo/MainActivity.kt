package com.example.grupo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.grupo.app.Grupo_LoginApp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Grupo_LoginApp()
            /*GrupoTheme {
                Scaffold( modifier = Modifier.fillMaxSize() ) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }*/
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Grupo_LoginApp()
}