package com.example.newsappcompose.domain.repo

import com.example.newsappcompose.api.model.newsResponse.News

interface NewsRepository {
    suspend fun getNews(sourceId : String) : List<News?>?
    suspend fun getNewsBySearch(searchText : String) : List<News?>?
}