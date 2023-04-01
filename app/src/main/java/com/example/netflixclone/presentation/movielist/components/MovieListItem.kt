package com.example.netflixclone.presentation.movielist.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter.State.Empty.painter
import coil.compose.rememberImagePainter
import com.example.netflixclone.R
import com.example.netflixclone.domain.model.Movie

@Composable
fun MovieListItem(
    movie:Movie
){
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp),
        shape = RoundedCornerShape(10.dp),
        elevation = 5.dp
    ) {
        Box(
            modifier = Modifier
                .height(200.dp)
                .width(100.dp)
        ) {
            Image(
                painter = rememberImagePainter(
                    data = movie.posterPath, builder = {
                        placeholder(R.drawable.boy)
                        crossfade(true)
                    }
                ),
                contentDescription = "",
                contentScale = ContentScale.Crop
            )
        }
    }

}