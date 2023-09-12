package com.example.newsappcompose

import androidx.compose.ui.graphics.Color
import com.example.newsappcompose.api.model.Category


object Constants {
    val categories = listOf(
        Category(
            "sports", R.drawable.ball,
            R.string.sports, Color(0xFFC91C22),
            R.color.red
        ),
        Category(
            "technology", R.drawable.politics,
            R.string.technology, Color(0xFF003E90),
            R.color.blue
        ),
        Category(
            "health", R.drawable.health,
            R.string.health, Color(0xFFED1E79),
            R.color.pink
        ),
        Category(
            "business", R.drawable.bussines,
            R.string.business, Color(0xFFCF7E48),
            R.color.brown_orange
        ),
        Category(
            "general", R.drawable.environment,
            R.string.general, Color(0xFF4882CF),
            R.color.baby_blue
        ),
        Category(
            "science", R.drawable.science,
            R.string.science, Color(0xFFF2D352),
            R.color.yellow
        ),
    )
}