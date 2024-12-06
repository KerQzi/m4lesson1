package com.example.m4lesson1

import java.io.Serializable

data class UserData(
    val name: String,
    val email: String,
    val password: String
) : Serializable