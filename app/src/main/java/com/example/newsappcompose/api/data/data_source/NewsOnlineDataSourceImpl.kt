package com.example.newsappcompose.api.data.data_source

import com.example.newsappcompose.api.WebServices
import com.example.newsappcompose.api.model.newsResponse.News
import com.example.newsappcompose.domain.data_source.NewsDataSource
import javax.inject.Inject

class NewsOnlineDataSourceImpl @Inject constructor(private val api : WebServices) : NewsDataSource {
    override suspend fun getNews(sourceId: String): List<News?>? {
      val response = api.getNewsBySource(sources = sourceId)
        return  response.articles
    }

    override suspend fun getNewsBySearch(searchText: String): List<News?>? {
        val response = api.getNewsBySearch(searchText = searchText)
        return response.articles
    }
}