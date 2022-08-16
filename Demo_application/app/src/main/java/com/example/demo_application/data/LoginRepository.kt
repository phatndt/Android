package com.example.demo_application.data

import com.example.demo_application.presentation.model.User
import com.example.demo_application.presentation.model.listUser
import dagger.Binds
import retrofit2.Response
import javax.inject.Inject

interface LoginRepository {
    fun login(username: String, password: String ): Response<User>
}
class LoginRepositoryImpl @Inject constructor(): LoginRepository {
    fun login(user: User, loginInterface: LoginInterface) {
        loginInterface.onResponse(listUser.find { it.username == user.username && it.password == user.password })
    }

    override fun login(username: String, password: String): Response<User> {
        TODO("Not yet implemented")
    }
}

interface LoginInterface {
    fun onResponse(user: User?)
}