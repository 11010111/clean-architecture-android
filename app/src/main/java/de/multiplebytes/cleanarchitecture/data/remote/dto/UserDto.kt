package de.multiplebytes.cleanarchitecture.data.remote.dto

data class UserDto(
    val id: Int,
    val name: String,
    val username: String,
    val email: String,
    val website: String,
    val phone: String
)
