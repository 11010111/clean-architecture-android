package de.multiplebytes.cleanarchitecture.domain.usecase

import de.multiplebytes.cleanarchitecture.domain.model.User
import de.multiplebytes.cleanarchitecture.domain.repository.UserRepository
import javax.inject.Inject

class GetUsersUseCase @Inject constructor(
    private val userRepository: UserRepository
) {
    suspend operator fun invoke(): Result<List<User>> {
        return userRepository.getAllUsers()
    }
}
