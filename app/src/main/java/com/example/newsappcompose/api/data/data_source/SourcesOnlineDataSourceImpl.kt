package com.example.newsappcompose.api.data.data_source

import com.example.newsappcompose.api.WebServices
import com.example.newsappcompose.api.model.sourceResponse.Source
import com.example.newsappcompose.domain.data_source.SourceDataSource
import javax.inject.Inject

class SourcesOnlineDataSourceImpl @Inject constructor(val api : WebServices) : SourceDataSource {
    override suspend fun getSources(category : String): List<Source?>? {
        val  response = api.getSourcesByCategory(category = category)
        return  response.sources
    }
}