package com.example.netflixclone.screen.fastlaugh

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun FastLaughScreen(){

    var scaffoldState = rememberScaffoldState()
    Scaffold(scaffoldState = scaffoldState) {

       FastLaughViewPager()
    }

}