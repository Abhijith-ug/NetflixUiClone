package com.example.netflixclone.domain.repository

import com.example.netflixclone.domain.model.Movie
import com.example.netflixclone.domain.model.MovieList
import retrofit2.Response

interface MovieRepository {
    suspend fun getTrendingTodayMovies():Response<MovieList>
    suspend fun getPopularMovies():Response<MovieList>
    suspend fun getUpcomingMovies():List<Movie>
    suspend fun getTopRatedMovies():List<Movie>
}