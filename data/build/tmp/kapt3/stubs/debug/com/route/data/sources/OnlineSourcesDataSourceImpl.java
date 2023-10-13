package com.route.data.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/route/data/sources/OnlineSourcesDataSourceImpl;", "Lcom/route/domain/repos/OnlineSourcesDataSource;", "newsServices", "Lcom/route/data/api/NewsServices;", "(Lcom/route/data/api/NewsServices;)V", "getSourcesFromAPI", "", "Lcom/route/domain/entities/SourceItemDTO;", "categoryId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class OnlineSourcesDataSourceImpl implements com.route.domain.repos.OnlineSourcesDataSource {
    private final com.route.data.api.NewsServices newsServices = null;
    
    @javax.inject.Inject
    public OnlineSourcesDataSourceImpl(@org.jetbrains.annotations.NotNull
    com.route.data.api.NewsServices newsServices) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSourcesFromAPI(@org.jetbrains.annotations.NotNull
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.route.domain.entities.SourceItemDTO>> continuation) {
        return null;
    }
}