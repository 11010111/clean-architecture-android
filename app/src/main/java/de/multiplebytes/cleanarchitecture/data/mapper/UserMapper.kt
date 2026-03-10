package de.multiplebytes.cleanarchitecture.data.mapper

import de.multiplebytes.cleanarchitecture.data.remote.dto.UserDto
import de.multiplebytes.cleanarchitecture.domain.model.User

fun UserDto.toDomain(): User {
    return User(
        id = id,
        name = name,
        email = email
    )
}
