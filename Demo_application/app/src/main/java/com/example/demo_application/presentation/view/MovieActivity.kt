package com.example.demo_application.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.demo_application.R
import com.example.demo_application.adapter.MovieAdapter
import com.example.demo_application.data.MovieRepository
import com.example.demo_application.data.MovieRepositoryImpl
import com.example.demo_application.data.network.api.ApiBuilder
import com.example.demo_application.data.network.api.MovieApi
import com.example.demo_application.databinding.ActivityMovieBinding
import com.example.demo_application.presentation.model.Movie
import com.example.demo_application.presentation.viewmodel.MovieViewModel
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.demo_application.MyApplication
import javax.inject.Inject

class MovieActivity : AppCompatActivity() {

    @Inject
    lateinit var movieViewModel: MovieViewModel

    private lateinit var movieAdapter: MovieAdapter

    private lateinit var binding: ActivityMovieBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        (application as MyApplication).appComponent.inject(this)

        super.onCreate(savedInstanceState)
        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        movieViewModel.getMovies();

        binding.rcv.layoutManager = LinearLayoutManager(this)


        val movieObserver = Observer<List<Movie>?> { it ->
            movieAdapter = MovieAdapter(it)
            binding.rcv.adapter = movieAdapter
        }

        movieViewModel.moviesLiveData.observe(this, movieObserver)
    }
}