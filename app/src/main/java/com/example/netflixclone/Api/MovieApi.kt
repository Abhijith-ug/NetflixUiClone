package com.example.netflixclone.Api

import com.example.netflixclone.Api.ApiConstants.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {

    @GET("movie/popular")
    suspend fun getPopularMovies(
        @Query("api_key")
        apiKey: String = API_KEY
    ): Response<MovieList>

    @GET("/movie/latest")
    suspend fun getLatestMovies(
        @Query("api_key")
        apiKey: String = API_KEY
    ): Response<Movie>

    @GET("/movie/top_rated")
    suspend fun getMovies(
        @Query("api_key")
        apiKey: String = API_KEY
    ): Response<Movie>


    @GET("/movie/upcoming")
    suspend fun upcomingMovies(
        @Query("api_key")
        apiKey: String = API_KEY
    ): Response<Movie>
}