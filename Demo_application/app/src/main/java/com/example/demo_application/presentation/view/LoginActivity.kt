package com.example.demo_application.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.demo_application.MyApplication
import com.example.demo_application.R
import com.example.demo_application.databinding.ActivityLoginBinding
import com.example.demo_application.presentation.viewmodel.LoginViewModel
import javax.inject.Inject

class LoginActivity : AppCompatActivity() {

    @Inject
    lateinit var loginViewModel: LoginViewModel

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        //(applicationContext as MyApplication)

        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //loginViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.btnLogin.setOnClickListener {
            loginViewModel.login(binding.textInputPassword.text.toString(), binding.textInputPassword.text.toString())
        }
    }
}