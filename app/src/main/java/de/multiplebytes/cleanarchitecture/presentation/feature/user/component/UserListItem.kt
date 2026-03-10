package de.multiplebytes.cleanarchitecture.presentation.feature.user.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import de.multiplebytes.cleanarchitecture.domain.model.User

@Composable
fun UserListItem(
    modifier: Modifier = Modifier,
    user: User
) {
    Card {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp)
        ) {
            Text(text = user.name)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun UserListItemPreview() {
    UserListItem(
        user = User(
            id = 1,
            name = "John Doe",
            email = "john.doe@example.com"
        )
    )
}
