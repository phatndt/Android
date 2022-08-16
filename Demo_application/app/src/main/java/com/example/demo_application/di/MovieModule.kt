package com.example.demo_application.di

import com.example.demo_application.data.MovieRepository
import com.example.demo_application.data.MovieRepositoryImpl
import com.example.demo_application.data.network.api.ApiBuilder
import com.example.demo_application.data.network.api.MovieApi
import dagger.Module
import dagger.Provides

@Module
class MovieModule {
    @Provides
    fun provideMovieApi():MovieApi {
        return ApiBuilder.createMovieApi()
    }

    @Provides
    fun provideLoginRepository(loginRepositoryImpl: MovieRepositoryImpl) : MovieRepository {
        return loginRepositoryImpl
    }

}