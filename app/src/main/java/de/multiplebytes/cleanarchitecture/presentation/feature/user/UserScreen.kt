package de.multiplebytes.cleanarchitecture.presentation.feature.user

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.lifecycle.viewmodel.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import de.multiplebytes.cleanarchitecture.presentation.feature.user.component.UserList

@Composable
fun UserScreen(
    modifier: Modifier = Modifier,
    viewModel: UserViewModel = hiltViewModel()
) {
    val userState by viewModel.state.collectAsStateWithLifecycle()

    UserList(
        modifier = modifier,
        userState = userState,
        onRetry = {
            viewModel.loadUsers()
        }
    )
}
