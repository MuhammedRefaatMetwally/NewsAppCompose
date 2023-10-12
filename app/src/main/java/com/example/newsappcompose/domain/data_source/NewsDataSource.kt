package com.example.newsappcompose.domain.data_source

import com.example.newsappcompose.api.model.newsResponse.News

interface NewsDataSource {
    suspend fun getNews(sourceId : String) : List<News?>?
    suspend fun getNewsBySearch(searchText : String) : List<News?>?
}