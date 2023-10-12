package com.example.newsappcompose.api.data.repo

import com.example.newsappcompose.api.model.newsResponse.News
import com.example.newsappcompose.domain.data_source.NewsDataSource
import com.example.newsappcompose.domain.repo.NewsRepository
import javax.inject.Inject

class NewsRepositoryImpl @Inject constructor(private val newsDataSource: NewsDataSource) :  NewsRepository {
    override suspend fun getNews(sourceId: String): List<News?>? {
        return  newsDataSource.getNews(sourceId)
    }

    override suspend fun getNewsBySearch(searchText: String): List<News?>? {
        return  newsDataSource.getNewsBySearch(searchText)
    }
}