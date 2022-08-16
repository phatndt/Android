package com.example.demo_application.data.network.api

import com.example.demo_application.data.network.Retrofit
import com.example.demo_application.presentation.model.Movie
import com.example.demo_application.presentation.model.Page
import retrofit2.create

class ApiBuilder {
    companion object {
        private val URL = "https://api.themoviedb.org/4/"

        fun createMovieApi() : MovieApi {
            return Retrofit.getClient(URL).create(MovieApi::class.java)
        }

    }


}
