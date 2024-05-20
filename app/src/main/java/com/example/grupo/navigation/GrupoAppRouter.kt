package com.example.grupo.navigation

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf

sealed class Screen() {
    data object SignUpScreen: Screen()
    data object TermsAndConditionsScreen : Screen()
    data object LoginScreen: Screen()
}

object GrupoAppRouter {
    val currentScreen : MutableState<Screen> = mutableStateOf(Screen.SignUpScreen)

    fun navigateTo(destination : Screen) {
        currentScreen.value = destination
    }
}