package com.example.netflixclone.data.repository

import android.util.Log
import com.example.netflixclone.data.remote.MovieApi
import com.example.netflixclone.domain.model.Movie
import com.example.netflixclone.domain.model.MovieList
import com.example.netflixclone.domain.repository.MovieRepository
import retrofit2.Response
import javax.inject.Inject
import kotlin.math.log

class MovieRepositoryImpl @Inject constructor(
    private val api: MovieApi
) : MovieRepository {
    val TAG = "MovieRepositoryImpl"

    override suspend fun getTrendingTodayMovies(): Response<MovieList> {
        return api.getTrendingTodayMovies()
    }

    override suspend fun getPopularMovies(): Response<MovieList> {
//        val result = api.getPopularMovies()
//        return result
        return api.getPopularMovies()
    }

    override suspend fun getUpcomingMovies(): List<Movie> {
        return api.getUpcomingMovies()
    }

    override suspend fun getTopRatedMovies(): List<Movie> {
        return api.getTopRatedMovies()
    }
}