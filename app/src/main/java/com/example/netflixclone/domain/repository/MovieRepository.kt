package com.example.netflixclone.domain.repository

import com.example.netflixclone.domain.model.Movie
import retrofit2.Response

interface MovieRepository {
    suspend fun getTrendingTodayMovies():List<Movie>
    suspend fun getPopularMovies():List<Movie>
    suspend fun getUpcomingMovies():List<Movie>
    suspend fun getTopRatedMovies():List<Movie>
}