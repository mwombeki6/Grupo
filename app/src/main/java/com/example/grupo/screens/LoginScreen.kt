package com.example.grupo.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.grupo.R
import com.example.grupo.components.ButtonComponent
import com.example.grupo.components.ClickableForgotPasswordComponent
import com.example.grupo.components.ClickableRegisterTextComponent
import com.example.grupo.components.DividerTextComponent
import com.example.grupo.components.HeadingTextComponent
import com.example.grupo.components.MyTextFieldComponent
import com.example.grupo.components.NormalTextComponent
import com.example.grupo.components.PasswordTextFieldComponent
import com.example.grupo.data.LoginViewModel
import com.example.grupo.data.UIEvent
import com.example.grupo.navigation.GrupoAppRouter
import com.example.grupo.navigation.Screen
import com.example.grupo.navigation.SystemBackButtonHandler

@Composable
fun LoginScreen(loginViewModel: LoginViewModel = LoginViewModel()) {
    Surface(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White)
        .padding(50.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.welcome_back))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.email),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.EmailChanged(it))
                }
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.lock),
                onTextSelected = {
                    loginViewModel.onEvent(UIEvent.PasswordChanged(it))
                }
            )
            Spacer(modifier = Modifier.height(10.dp))
            ClickableForgotPasswordComponent {
                // routing to forgot password screen
            }
            Spacer(modifier = Modifier.height(175.dp))

            ButtonComponent(value = stringResource(id = R.string.login), onButtonClicked = {
                loginViewModel.onEvent(UIEvent.RegisterButtonClicked)
            })

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableRegisterTextComponent {
                GrupoAppRouter.navigateTo(Screen.SignUpScreen)
            }
        }
    }
    SystemBackButtonHandler {
        GrupoAppRouter.navigateTo(Screen.SignUpScreen)
    }
}

@Preview
@Composable
fun LoginScreenPreview() {
    LoginScreen()
}