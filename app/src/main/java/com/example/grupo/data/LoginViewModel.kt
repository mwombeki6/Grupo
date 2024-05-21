package com.example.grupo.data

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoginViewModel :ViewModel() {
    var registrationUIState = mutableStateOf(RegistrationUIState())
}