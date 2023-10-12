package com.example.newsappcompose.api.data.repo

import com.example.newsappcompose.api.model.sourceResponse.Source
import com.example.newsappcompose.domain.data_source.SourceDataSource
import com.example.newsappcompose.domain.repo.SourceRepository
import javax.inject.Inject


class SourcesRepositoryImpl @Inject constructor(private val sourceDataSource: SourceDataSource) : SourceRepository {
    override suspend fun getSource(category : String): List<Source?>? {
        return sourceDataSource.getSources(category)
    }
}