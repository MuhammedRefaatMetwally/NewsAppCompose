package com.route.data.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/route/data/di/SourcesRepositoryModule;", "", "()V", "provideSourceRepository", "Lcom/route/domain/repos/SourcesRepository;", "sourceRepositoryImpl", "Lcom/route/data/sources/SourcesRepositoryImpl;", "provideSourcesOfflineDataSource", "Lcom/route/domain/repos/OfflineSourcesDataSource;", "offlineDataSourceImpl", "Lcom/route/data/sources/OfflineSourcesDataSourceImpl;", "provideSourcesOnlineDataSource", "Lcom/route/domain/repos/OnlineSourcesDataSource;", "onlineSourcesDataSourceImpl", "Lcom/route/data/sources/OnlineSourcesDataSourceImpl;", "data_debug"})
@dagger.Module
public abstract class SourcesRepositoryModule {
    
    public SourcesRepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.route.domain.repos.SourcesRepository provideSourceRepository(@org.jetbrains.annotations.NotNull
    com.route.data.sources.SourcesRepositoryImpl sourceRepositoryImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.route.domain.repos.OnlineSourcesDataSource provideSourcesOnlineDataSource(@org.jetbrains.annotations.NotNull
    com.route.data.sources.OnlineSourcesDataSourceImpl onlineSourcesDataSourceImpl);
    
    @org.jetbrains.annotations.NotNull
    @dagger.Binds
    public abstract com.route.domain.repos.OfflineSourcesDataSource provideSourcesOfflineDataSource(@org.jetbrains.annotations.NotNull
    com.route.data.sources.OfflineSourcesDataSourceImpl offlineDataSourceImpl);
}