package com.example.netflixclone.presentation.movielist

import android.util.Log
import androidx.compose.runtime.State
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.netflixclone.common.Resource
import com.example.netflixclone.domain.usecase.getmovies.GetPopularMoviesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieListViewModel @Inject constructor(
    private val getPopularMoviesUseCase: GetPopularMoviesUseCase
) : ViewModel() {
    private val _state = mutableStateOf(PopularMovieListState())
    val state: State<PopularMovieListState> = _state

    init {
        getPopularMovies()
    }

    private fun getPopularMovies() {
        getPopularMoviesUseCase().onEach { result ->
            Log.i("Abhi", "getPopularMovies: $result")

            when (result) {
                is Resource.Success -> {
                    _state.value =
                        PopularMovieListState(movies = result.data?.results ?: emptyList())
                }
                is Resource.Error -> {
                    _state.value = PopularMovieListState(
                        error = result.message ?: "An unexpected error occured"
                    )
                }
                is Resource.Loading -> {
                    _state.value = PopularMovieListState(
                        isLoading = true
                    )
                }
            }
        }.launchIn(viewModelScope)
    }

}
