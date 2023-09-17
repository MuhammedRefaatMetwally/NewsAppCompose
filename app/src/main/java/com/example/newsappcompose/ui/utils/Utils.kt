package com.example.newsappcompose.ui.utils

import android.util.Log
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

fun formatDate(time : String = "2023-09-15T13:12:39Z")  {
    val inputFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.getDefault())
    val outputFormat = SimpleDateFormat("yyyy-MM-dd hh:mm:ss a",Locale.getDefault())
    val parsedDate = inputFormat.parse(time)
    val formattedDate = parsedDate?.let { outputFormat.format(it) }
    if (formattedDate != null) {
        Log.d("DATE" , formattedDate)
    }
       println(formattedDate)
    //return formattedDate
}