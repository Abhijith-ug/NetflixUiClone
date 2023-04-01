package com.example.netflixclone.data.remote

import com.example.netflixclone.common.Constants.API_KEY
import com.example.netflixclone.domain.model.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("trending/movie/day")
    suspend fun getTrendingTodayMovies(
        @Query("api_key")
        apiKey: String = API_KEY
    ): List<Movie>

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey: String =  API_KEY
    ): List<Movie>

    @GET("movie/upcoming")
    suspend fun getUpcomingMovies(
        @Query("api_key")
        apiKey: String  = API_KEY
    ): List<Movie>

    @GET("movie/top_rated")
    suspend fun getTopRatedMovies(
        @Query("api_key")
        apiKey: String = API_KEY
    ): List<Movie>

}