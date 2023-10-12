package com.example.newsappcompose.domain.data_source

import com.example.newsappcompose.api.model.sourceResponse.Source

interface SourceDataSource {
    suspend fun getSources(category : String) : List<Source?>?
}