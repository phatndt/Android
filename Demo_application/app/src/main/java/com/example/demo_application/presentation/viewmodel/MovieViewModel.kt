package com.example.demo_application.presentation.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.demo_application.data.MovieRepository
import com.example.demo_application.presentation.model.Movie
import com.example.demo_application.presentation.model.Page
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

class MovieViewModel @Inject constructor(private val repository: MovieRepository): ViewModel() {
    var moviesLiveData = MutableLiveData<List<Movie>?>()

    fun getMovies() {
        viewModelScope.launch {
            val page = repository.getMovies()
            moviesLiveData.value = page.result
        }
    }
}


