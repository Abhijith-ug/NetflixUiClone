package com.example.netflixclone.data.repository

import android.util.Log
import com.example.netflixclone.data.remote.MovieApi
import com.example.netflixclone.domain.model.Movie
import com.example.netflixclone.domain.repository.MovieRepository
import retrofit2.Response
import javax.inject.Inject
import kotlin.math.log

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieApi
):MovieRepository {
    override suspend fun getTrendingTodayMovies(): List<Movie> {
        return api.getTrendingTodayMovies()
    }

    override suspend fun getPopularMovies(): List<Movie> {
        return api.getPopularMovies()
    }

    override suspend fun getUpcomingMovies(): List<Movie> {
        return api.getUpcomingMovies()
    }

    override suspend fun getTopRatedMovies(): List<Movie> {
        return api.getTopRatedMovies()
    }
}