package de.multiplebytes.cleanarchitecture.domain.repository

import de.multiplebytes.cleanarchitecture.domain.model.User

interface UserRepository {
    suspend fun getAllUsers(): Result<List<User>>
}
