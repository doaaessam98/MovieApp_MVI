package com.example.movieapp.Screens.intent

import com.example.movieapp.models.Movie

sealed class HomeIntent{
    object FetchPopularMovies : HomeIntent()
    object FetchTopRateMovies : HomeIntent()
    data class MovieSelected(val movie: Movie) : HomeIntent()
}