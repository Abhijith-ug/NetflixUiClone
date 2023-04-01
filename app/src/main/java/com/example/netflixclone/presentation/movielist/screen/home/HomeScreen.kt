package com.example.netflixclone.presentation.movielist.screen.home

import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.rememberScrollableState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.compose.rememberNavController
import com.example.netflixclone.presentation.movielist.components.MovieListScreen
import com.example.netflixclone.presentation.movielist.screen.navigation.BottomNavItem
import com.example.netflixclone.presentation.movielist.screen.navigation.BottomNavigationBar
import com.example.netflixclone.presentation.movielist.screen.navigation.Navigation


@Composable
fun HomeScreen() {
    var scafoldstate = rememberScaffoldState()
    var scrollState = rememberScrollState()
    val navController = rememberNavController()
    Scaffold() {
        //Navigation(navController = navController)

        Column(
            modifier = Modifier
                .background(Color.Black)
                .verticalScroll(scrollState)
//                .verticalScroll(scrollState)
        ) {

            MovieCard()
            MovieListScreen()

        }

    }

}