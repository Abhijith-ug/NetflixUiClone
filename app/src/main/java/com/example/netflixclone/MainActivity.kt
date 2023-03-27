package com.example.netflixclone

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.Search
import androidx.lifecycle.MutableLiveData
import androidx.navigation.compose.rememberNavController
import com.example.netflixclone.Api.Movie
import com.example.netflixclone.Api.RetrofitInstance
import com.example.netflixclone.screen.navigation.BottomNavItem
import com.example.netflixclone.screen.navigation.BottomNavigationBar
import com.example.netflixclone.screen.navigation.Navigation
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    private val _popularMovies = MutableLiveData<List<Movie>>()
    val popMovies: MutableLiveData<List<Movie>> = _popularMovies

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            Scaffold(bottomBar = {
                BottomNavigationBar(
                    items = listOf(
                        BottomNavItem(
                            name = "Home",
                            route = "home",
                            icon = Icons.Default.Home
                        ),
                        BottomNavItem(
                            name = "Fast Laugh",
                            route = "fast laugh",
                            icon = Icons.Default.Face
                        ),
                        BottomNavItem(
                            name = "Search",
                            route = "search",
                            icon = Icons.Default.Search
                        ),
                        BottomNavItem(
                            name = "Downloads",
                            route = "downloads",
                            icon = Icons.Default.KeyboardArrowDown
                        )
                    ), navController = navController, onItemClick = {
                        navController.navigate(it.route)
                    })

            }) {
                Navigation(navController = navController)
            }
        }

//        CoroutineScope(Dispatchers.Main).launch {
//            val popularMovies = RetrofitInstance.api.getPopularMovies().body()
//            popMovies.value = popularMovies?.movies
//            Log.i("Test1", "onCreate: ${popularMovies}")
//        }
    }
}


