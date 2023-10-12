package com.example.newsappcompose.api.data

import com.example.newsappcompose.api.data.data_source.NewsOnlineDataSourceImpl
import com.example.newsappcompose.api.data.data_source.SourcesOnlineDataSourceImpl
import com.example.newsappcompose.api.data.repo.NewsRepositoryImpl
import com.example.newsappcompose.api.data.repo.SourcesRepositoryImpl
import com.example.newsappcompose.domain.data_source.NewsDataSource
import com.example.newsappcompose.domain.data_source.SourceDataSource
import com.example.newsappcompose.domain.repo.NewsRepository
import com.example.newsappcompose.domain.repo.SourceRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {  // mdam bt3md 3la Interface wa Implementation bta3o esht8l abstract class a7sn m3a @Binds
    @Binds
    abstract fun provideSourcesRepository(
        repo:SourcesRepositoryImpl
    ) : SourceRepository

    @Binds
    abstract fun provideSourcesDataSource(
        dataSource : SourcesOnlineDataSourceImpl
    ): SourceDataSource

    @Binds
    abstract fun provideNewsRepository(
        repo : NewsRepositoryImpl
    ) : NewsRepository


    @Binds
    abstract fun provideNewsDataSource(
        dataSource : NewsOnlineDataSourceImpl
    ) : NewsDataSource


}