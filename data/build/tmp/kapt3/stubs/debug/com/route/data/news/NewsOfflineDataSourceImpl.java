package com.route.data.news;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/route/data/news/NewsOfflineDataSourceImpl;", "Lcom/route/domain/repos/NewsOfflineDataSource;", "newsDao", "Lcom/route/data/database/NewsDao;", "(Lcom/route/data/database/NewsDao;)V", "getNewsFromDB", "", "Lcom/route/domain/entities/ArticlesItemDTO;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveNewsToDB", "", "newsList", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class NewsOfflineDataSourceImpl implements com.route.domain.repos.NewsOfflineDataSource {
    private final com.route.data.database.NewsDao newsDao = null;
    
    @javax.inject.Inject
    public NewsOfflineDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.route.data.database.NewsDao newsDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getNewsFromDB(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.route.domain.entities.ArticlesItemDTO>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object saveNewsToDB(@org.jetbrains.annotations.NotNull
    java.util.List<com.route.domain.entities.ArticlesItemDTO> newsList, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}