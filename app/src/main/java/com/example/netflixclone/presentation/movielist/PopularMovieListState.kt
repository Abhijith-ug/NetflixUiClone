package com.example.netflixclone.presentation.movielist

import com.example.netflixclone.domain.model.Movie

data class PopularMovieListState(
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error: String = ""
)
