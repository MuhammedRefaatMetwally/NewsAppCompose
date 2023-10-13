package com.route.data.news

import com.route.data.NetworkHandler
import com.route.domain.entities.ArticlesItemDTO
import com.route.domain.repos.NewsOfflineDataSource
import com.route.domain.repos.NewsOnlineDataSource
import com.route.domain.repos.NewsRepository
import javax.inject.Inject

// Domain-Driven Development

// TDD - Test-Driven Development
class NewsRepositoryImpl @Inject constructor(
    private val onlineDataSource: NewsOnlineDataSource,
    private val offlineDataSource: NewsOfflineDataSource,
    private val networkHandler: NetworkHandler
) : NewsRepository {
    override suspend fun getNewsData(sourceId: String): List<ArticlesItemDTO> {
        return try {
            if (networkHandler.isOnline()) {
                val newsList = onlineDataSource.getNewsFromAPI(sourceId)
                offlineDataSource.saveNewsToDB(newsList)
                newsList
            } else
                offlineDataSource.getNewsFromDB()
        } catch (ex: Exception) {
            throw ex
        }
    }


}
