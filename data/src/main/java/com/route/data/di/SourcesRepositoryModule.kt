package com.route.data.di

import com.route.data.NetworkHandler
import com.route.data.api.NewsServices
import com.route.data.database.SourcesDao
import com.route.data.news.NewsOfflineDataSourceImpl
import com.route.data.news.NewsRepositoryImpl
import com.route.data.sources.OfflineSourcesDataSourceImpl
import com.route.data.sources.OnlineSourcesDataSourceImpl
import com.route.data.sources.SourcesRepositoryImpl
import com.route.domain.repos.OfflineSourcesDataSource
import com.route.domain.repos.OnlineSourcesDataSource
import com.route.domain.repos.SourcesRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract  class SourcesRepositoryModule {

    @Binds
    abstract fun provideSourceRepository(
        sourceRepositoryImpl: SourcesRepositoryImpl
    ) : SourcesRepository


    @Binds
    abstract fun provideSourcesOnlineDataSource(
        onlineSourcesDataSourceImpl: OnlineSourcesDataSourceImpl
    ) : OnlineSourcesDataSource

    @Binds
    abstract fun provideSourcesOfflineDataSource(
        offlineDataSourceImpl: OfflineSourcesDataSourceImpl
    ) : OfflineSourcesDataSource

}