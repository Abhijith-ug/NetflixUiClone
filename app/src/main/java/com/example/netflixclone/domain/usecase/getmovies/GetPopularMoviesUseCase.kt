package com.example.netflixclone.domain.usecase.getmovies

import android.util.Log
import com.example.netflixclone.common.Resource
import com.example.netflixclone.domain.model.Movie
import com.example.netflixclone.domain.repository.MovieRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.launchIn
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetPopularMoviesUseCase @Inject constructor(
    private val repository: MovieRepository
) {
    operator fun invoke(): Flow<Resource<List<Movie>>> = flow {
        try {
            emit(Resource.Loading<List<Movie>>())
            Log.i("GetPopularMoviesUseCase", "Loading done.")
            val popularMovies = repository.getPopularMovies()
            Log.i("GetPopularMoviesUse", "invoke: ${popularMovies.toString()}")
            emit(Resource.Success<List<Movie>>(popularMovies))

        } catch (e:HttpException){
            emit(Resource.Error<List<Movie>>(e.localizedMessage?: "An unexpected error occurred"))
        } catch (e:IOException){
            emit(Resource.Error<List<Movie>>("Check your internet connection"))
        }
    }
}