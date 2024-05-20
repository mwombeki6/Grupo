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
import com.example.grupo.components.CheckboxComponent
import com.example.grupo.components.ClickableLoginTextComponent
import com.example.grupo.components.DividerTextComponent
import com.example.grupo.components.HeadingTextComponent
import com.example.grupo.components.MyTextFieldComponent
import com.example.grupo.components.NormalTextComponent
import com.example.grupo.components.PasswordTextFieldComponent
import com.example.grupo.navigation.GrupoAppRouter
import com.example.grupo.navigation.Screen

@Composable
fun SignUpScreen() {
    Surface(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(50.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent(value = stringResource(id = R.string.create_account))
            Spacer(modifier = Modifier.height(20.dp))
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.first_name),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.last_name),
                painterResource(id = R.drawable.profile)
            )
            MyTextFieldComponent(
                labelValue = stringResource(id = R.string.email),
                painterResource(id = R.drawable.email)
            )
            PasswordTextFieldComponent(
                labelValue = stringResource(id = R.string.password),
                painterResource(id = R.drawable.lock)
            )
            CheckboxComponent(onTextSelected = {
                GrupoAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
            })

            Spacer(modifier = Modifier.height(40.dp))

            ButtonComponent(value = stringResource(id = R.string.register))

            Spacer(modifier = Modifier.height(20.dp))

            DividerTextComponent()

            ClickableLoginTextComponent(onTextSelected =  {
                GrupoAppRouter.navigateTo(Screen.LoginScreen)
            })
        }
    }
}
@Preview
@Composable
fun DefaultPreviewOfSignUpScreen() {
    SignUpScreen()
}