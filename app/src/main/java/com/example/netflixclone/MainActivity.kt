package com.example.netflixclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.netflixclone.screen.Downloads.DownloadScreen
import com.example.netflixclone.screen.Downloads.DownloadScreenTexts
import com.example.netflixclone.screen.WelcomeScreen
import com.example.netflixclone.screen.fastlaugh.FastLaughScreen
import com.example.netflixclone.screen.home.HomeScreen
import com.example.netflixclone.screen.search.SearchScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            WelcomeScreen()
//            HomeScreen()
//            DownloadScreen()
//            SearchScreen()
            FastLaughScreen()

        }
    }
}


