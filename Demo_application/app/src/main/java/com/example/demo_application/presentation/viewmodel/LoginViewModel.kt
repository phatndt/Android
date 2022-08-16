package com.example.demo_application.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.demo_application.data.LoginInterface
import com.example.demo_application.data.LoginRepository
import com.example.demo_application.presentation.model.User
import javax.inject.Inject

class LoginViewModel @Inject constructor(
    val loginRepository: LoginRepository,
    ): ViewModel() {

    init {
        //users = MutableLiveData<User>()
        //loginRepository = LoginRepository()
    }
    fun login(username: String,password: String) {
//        loginRepository.login(User(username,password), LoginInterface.onResponse())
    }
}