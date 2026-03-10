package de.multiplebytes.cleanarchitecture.presentation.feature.user

import de.multiplebytes.cleanarchitecture.domain.model.User

sealed interface UserState {
    data object Loading : UserState
    data class Success(val users: List<User>) : UserState
    data class Failure(val message: String) : UserState
}
