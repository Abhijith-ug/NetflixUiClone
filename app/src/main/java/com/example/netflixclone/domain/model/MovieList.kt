package com.example.netflixclone.domain.model

data class MovieList(
    val page: Int,
    val results: List<Movie>,
    val total_pages: Int,
    val total_results: Int
)
