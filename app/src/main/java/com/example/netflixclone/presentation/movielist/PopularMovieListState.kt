package com.example.netflixclone.presentation.movielist

import com.example.netflixclone.domain.model.Movie
import com.example.netflixclone.domain.model.MovieList
import retrofit2.Response

data class PopularMovieListState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error: String = ""
)
