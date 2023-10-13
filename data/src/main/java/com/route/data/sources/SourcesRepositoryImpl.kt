package com.route.data.sources

import com.route.data.NetworkHandler
import com.route.domain.entities.SourceItemDTO
import com.route.domain.repos.OfflineSourcesDataSource
import com.route.domain.repos.OnlineSourcesDataSource
import com.route.domain.repos.SourcesRepository
import javax.inject.Inject

class SourcesRepositoryImpl @Inject constructor(
    private val onlineSourcesDataSource: OnlineSourcesDataSource,
    private val offlineSourcesDataSource: OfflineSourcesDataSource,
    private val networkHandler: NetworkHandler
) : SourcesRepository {
    override suspend fun getSources(categoryId: String): List<SourceItemDTO> {
        return try {
            if (networkHandler.isOnline()) {
                val sources = onlineSourcesDataSource.getSourcesFromAPI(categoryId)
                offlineSourcesDataSource.saveSourcesIntoDB(sources)
                sources
            } else
                offlineSourcesDataSource.getSourcesFromDB()
        } catch (ex: Exception) {
            throw ex
        }
    }

}