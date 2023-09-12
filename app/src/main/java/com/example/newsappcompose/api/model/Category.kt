package com.example.newsappcompose.api.model

import androidx.compose.ui.graphics.Color

data class Category(
    val apiID: String,
    val drawableResId: Int,
    val titleResID: Int,
    val backgroundColor: Color,
    val idColor: Int,
)