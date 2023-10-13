package com.route.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/route/data/di/NewsRepositoryModule;", "", "()V", "provideNewsDataSource", "Lcom/route/domain/repos/NewsOnlineDataSource;", "newsOnlineDataSourceImpl", "Lcom/route/data/news/NewsOnlineDataSourceImpl;", "provideNewsOfflineDataSource", "Lcom/route/domain/repos/NewsOfflineDataSource;", "newsOfflineDataSourceImpl", "Lcom/route/data/news/NewsOfflineDataSourceImpl;", "provideNewsRepository", "Lcom/route/domain/repos/NewsRepository;", "newsRepositoryImpl", "Lcom/route/data/news/NewsRepositoryImpl;", "data_debug"})
@dagger.Module
public abstract class NewsRepositoryModule {
    
    public NewsRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.route.domain.repos.NewsRepository provideNewsRepository(@org.jetbrains.annotations.NotNull
    com.route.data.news.NewsRepositoryImpl newsRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.route.domain.repos.NewsOnlineDataSource provideNewsDataSource(@org.jetbrains.annotations.NotNull
    com.route.data.news.NewsOnlineDataSourceImpl newsOnlineDataSourceImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.route.domain.repos.NewsOfflineDataSource provideNewsOfflineDataSource(@org.jetbrains.annotations.NotNull
    com.route.data.news.NewsOfflineDataSourceImpl newsOfflineDataSourceImpl);
}