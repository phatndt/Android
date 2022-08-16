package com.example.demo_application.di

import android.content.Context
import com.example.demo_application.presentation.view.LoginActivity
import com.example.demo_application.presentation.view.MovieActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Component(modules = [MovieModule::class])
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context) : AppComponent
    }

    //fun inject(activity: LoginActivity)
    fun inject(activity: MovieActivity)
}