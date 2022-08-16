package com.example.demo_application.data.network.api

import com.example.demo_application.presentation.model.Movie
import com.example.demo_application.presentation.model.Page
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Inject

interface MovieApi {
    @GET("list/{list_id}/")
    suspend fun getMovies(@Path("list_id") list_id: Int, @Query("api_key") api_key: String): Page
}