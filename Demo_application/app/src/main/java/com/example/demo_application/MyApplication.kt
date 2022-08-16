package com.example.demo_application

import android.app.Application
import com.example.demo_application.di.AppComponent
import com.example.demo_application.di.DaggerAppComponent

open class MyApplication: Application() {
    val appComponent: AppComponent by lazy {
        DaggerAppComponent.factory().create(applicationContext)
    }
}