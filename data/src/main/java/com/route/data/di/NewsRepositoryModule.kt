package com.route.data.di

import com.route.data.NetworkHandler
import com.route.data.api.NewsServices
import com.route.data.database.NewsDao
import com.route.data.news.NewsOfflineDataSourceImpl
import com.route.data.news.NewsOnlineDataSourceImpl
import com.route.data.news.NewsRepositoryImpl
import com.route.domain.repos.NewsOfflineDataSource
import com.route.domain.repos.NewsOnlineDataSource
import com.route.domain.repos.NewsRepository
import com.route.domain.repos.SourcesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
abstract class NewsRepositoryModule {

    @Binds
    abstract fun provideNewsRepository(
        newsRepositoryImpl: NewsRepositoryImpl
    ) : NewsRepository


    @Binds
    abstract fun provideNewsDataSource(
        newsOnlineDataSourceImpl: NewsOnlineDataSourceImpl
    ) : NewsOnlineDataSource

    @Binds
    abstract fun provideNewsOfflineDataSource(
        newsOfflineDataSourceImpl: NewsOfflineDataSourceImpl
    ) : NewsOfflineDataSource




}
