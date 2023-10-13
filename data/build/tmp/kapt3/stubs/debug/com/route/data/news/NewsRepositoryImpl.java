package com.route.data.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/route/data/news/NewsRepositoryImpl;", "Lcom/route/domain/repos/NewsRepository;", "onlineDataSource", "Lcom/route/domain/repos/NewsOnlineDataSource;", "offlineDataSource", "Lcom/route/domain/repos/NewsOfflineDataSource;", "networkHandler", "Lcom/route/data/NetworkHandler;", "(Lcom/route/domain/repos/NewsOnlineDataSource;Lcom/route/domain/repos/NewsOfflineDataSource;Lcom/route/data/NetworkHandler;)V", "getNewsData", "", "Lcom/route/domain/entities/ArticlesItemDTO;", "sourceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class NewsRepositoryImpl implements com.route.domain.repos.NewsRepository {
    private final com.route.domain.repos.NewsOnlineDataSource onlineDataSource = null;
    private final com.route.domain.repos.NewsOfflineDataSource offlineDataSource = null;
    private final com.route.data.NetworkHandler networkHandler = null;
    
    @javax.inject.Inject
    public NewsRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.route.domain.repos.NewsOnlineDataSource onlineDataSource, @org.jetbrains.annotations.NotNull
    com.route.domain.repos.NewsOfflineDataSource offlineDataSource, @org.jetbrains.annotations.NotNull
    com.route.data.NetworkHandler networkHandler) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsData(@org.jetbrains.annotations.NotNull
    java.lang.String sourceId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.route.domain.entities.ArticlesItemDTO>> continuation) {
        return null;
    }
}