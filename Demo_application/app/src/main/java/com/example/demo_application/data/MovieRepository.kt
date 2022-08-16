package com.example.demo_application.data

import com.example.demo_application.data.network.Retrofit
import com.example.demo_application.data.network.api.MovieApi
import com.example.demo_application.presentation.model.Movie
import com.example.demo_application.presentation.model.Page
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject


interface MovieRepository {
    suspend fun getMovies(): Page
}

class MovieRepositoryImpl @Inject constructor(private val movieApi: MovieApi) : MovieRepository {

    override suspend fun getMovies(): Page {
        return withContext(Dispatchers.IO) {
            movieApi.getMovies(1, "459e38f0304cf91462da118726581711")
        }
    }
}
