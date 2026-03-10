package de.multiplebytes.cleanarchitecture.presentation.feature.user.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.multiplebytes.cleanarchitecture.domain.model.User
import de.multiplebytes.cleanarchitecture.presentation.common.FailureDialog
import de.multiplebytes.cleanarchitecture.presentation.feature.user.UserState
import de.multiplebytes.cleanarchitecture.presentation.theme.CleanArchitectureTheme

@Composable
fun UserList(
    modifier: Modifier = Modifier,
    userState: UserState,
    onRetry: () -> Unit = {}
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        when (userState) {
            is UserState.Loading -> CircularProgressIndicator()
            is UserState.Success -> UserListSuccess(users = userState.users)
            is UserState.Failure -> FailureDialog(
                message = userState.message,
                onDismissRequest = {},
                onRetry = onRetry
            )
        }
    }
}

@Preview(showBackground = true, name = "UserState Loading")
@Composable
private fun UserListLoadingPreview() {
    CleanArchitectureTheme {
        UserList(
            userState = UserState.Loading,
        )
    }
}

@Preview(showBackground = true, name = "UserState Success")
@Composable
private fun UserListSuccessPreview() {
    CleanArchitectureTheme {
        UserList(
            userState = UserState.Success(
                users = listOf(
                    User(
                        id = 1,
                        name = "John Doe",
                        email = "john.doe@example.com"
                    )
                )
            )
        )
    }
}

@Preview(showBackground = true, name = "UserState Failure")
@Composable
private fun UserListFailurePreview() {
    CleanArchitectureTheme {
        UserList(
            userState = UserState.Failure(
                message = "Connection error"
            )
        )
    }
}
