package de.multiplebytes.cleanarchitecture.presentation.feature.user.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.multiplebytes.cleanarchitecture.domain.model.User

@Composable
fun UserListSuccess(
    modifier: Modifier = Modifier,
    users: List<User>
) {
    LazyColumn(
        modifier = modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        items(users) { user ->
            UserListItem(user = user)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UserListSuccessPreview() {
    UserListSuccess(
        users = listOf(
            User(
                id = 1,
                name = "John Doe",
                email = "john.doe@example.com"
            )
        )
    )
}
