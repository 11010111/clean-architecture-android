package de.multiplebytes.cleanarchitecture.data.repository

import de.multiplebytes.cleanarchitecture.data.mapper.toDomain
import de.multiplebytes.cleanarchitecture.data.remote.UserApi
import de.multiplebytes.cleanarchitecture.domain.model.User
import de.multiplebytes.cleanarchitecture.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val userApi: UserApi
) : UserRepository {
    override suspend fun getAllUsers(): Result<List<User>> {
        return try {
            val response = userApi.getUsers()
            val domainUsers = response.map { it.toDomain() }
            Result.success(domainUsers)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}
