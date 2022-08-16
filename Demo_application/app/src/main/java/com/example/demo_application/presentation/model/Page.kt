package com.example.demo_application.presentation.model

import com.google.gson.annotations.SerializedName

data class Page (
    @SerializedName("name")
    val name: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("results")
    val result: List<Movie>? = null
)