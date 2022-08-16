package com.example.demo_application.presentation.model

import javax.inject.Inject

class User @Inject constructor(val username: String, val password: String)

val listUser: List<User> = listOf(User("thanhphat219", "thanhphat219"))