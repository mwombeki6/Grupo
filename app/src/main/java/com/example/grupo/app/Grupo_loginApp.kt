package com.example.grupo.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.grupo.navigation.GrupoAppRouter
import com.example.grupo.navigation.Screen
import com.example.grupo.screens.LoginScreen
import com.example.grupo.screens.SignUpScreen
import com.example.grupo.screens.TermsAndConditionsScreen

@Composable
fun Grupo_LoginApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = GrupoAppRouter.currentScreen) { currentState->
            when(currentState.value) {
                is Screen.SignUpScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                    TermsAndConditionsScreen()
                }
                is Screen.LoginScreen -> {
                    LoginScreen()
                }
            }
        }
    }
}