package com.example.newsappcompose.ui.screens.home

import android.util.Log
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.ViewModel
import androidx.navigation.compose.rememberNavController
import com.example.newsappcompose.api.ApiManager
import com.example.newsappcompose.api.model.newsResponse.News
import com.example.newsappcompose.api.model.newsResponse.NewsResponse
import com.example.newsappcompose.api.model.sourceResponse.Source
import com.example.newsappcompose.api.model.sourceResponse.SourcesResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NewsViewModel : ViewModel() {
    val sourcesList: MutableState<List<Source?>?> = mutableStateOf(emptyList())


    val newsList: MutableState<List<News?>?> = mutableStateOf(emptyList())

    var selectedIndex = mutableIntStateOf(0)
    val pageSize = mutableIntStateOf(20)
    var page = mutableIntStateOf(1)


    fun getSourcesByCategory(category: String?, sourcesList: MutableState<List<Source?>?>) {

        ApiManager
            .getApis()
            .getSourcesByCategory(category = category ?: "")
            .enqueue(object : Callback<SourcesResponse> {
                override fun onResponse(
                    call: Call<SourcesResponse>,
                    response: Response<SourcesResponse>
                ) {
                    val body = response.body()

                    sourcesList.value = body?.sources ?: emptyList()
                }

                override fun onFailure(call: Call<SourcesResponse>, t: Throwable) {

                }

            }
            )
    }

    fun getNewsBySources(source: Source?, newsList: MutableState<List<News?>?>) {
        ApiManager.getApis().getNewsBySource(
            sources = source?.id ?: "", pageSize = pageSize.intValue,
            page = page.intValue
        ).enqueue(
            object : Callback<NewsResponse> {
                override fun onResponse(
                    call: Call<NewsResponse>,
                    response: Response<NewsResponse>
                ) {
                    newsList.value = response.body()?.articles ?: emptyList()

                }

                override fun onFailure(call: Call<NewsResponse>, t: Throwable) {

                }

            }
        )
    }

}