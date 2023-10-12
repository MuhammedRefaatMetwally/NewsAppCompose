package com.example.newsappcompose.domain.repo

import com.example.newsappcompose.api.model.sourceResponse.Source


interface SourceRepository {
    suspend fun getSource(category : String) : List<Source?>?
}