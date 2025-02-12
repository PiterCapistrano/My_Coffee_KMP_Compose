package org.pitercapistrano.mycoffee.features.sign_in

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.pitercapistrano.mycoffee.model.LoginUiState
import org.pitercapistrano.mycoffee.model.User
import org.pitercapistrano.mycoffee.viewmodel.AuthViewModel

@Composable
fun SignIn(
    navController: NavController,
    viewModel: AuthViewModel
) {

    val uiState by viewModel.uiState.collectAsState()
    val emailError by viewModel.emailError.collectAsState()
    val passwordError by viewModel.passwordError.collectAsState()
    val isProcessing by viewModel.isProcessing.collectAsState()
    val isButtonEnabled by viewModel.isProcessing.collectAsState()
    val currentUser by viewModel.currentUser.collectAsState()

    LoginScreenContent(
        uiState = uiState,
        onEmailChange = viewModel::onEmailChange,
        onPasswordChange = viewModel::onPasswordChange,
        onSignInClick = { viewModel.onSignInClick() },
        isProcessing = isProcessing,
        currentUser = currentUser,
        isError = emailError || passwordError,
        onSignOut = viewModel::onSignOut
        )
}

@OptIn(ExperimentalResourceApi::class)
@Composable
fun LoginScreenContent(
    modifier: Modifier = Modifier,
    uiState: LoginUiState,
    onEmailChange: (String) -> Unit,
    onPasswordChange: (String) -> Unit,
    onSignInClick: () -> Unit,
    isProcessing: Boolean,
    currentUser: User?,
    isError:Boolean,
    onSignOut: () -> Unit,
    ) {

}
