package com.route.data.sources;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/route/data/sources/SourcesRepositoryImpl;", "Lcom/route/domain/repos/SourcesRepository;", "onlineSourcesDataSource", "Lcom/route/domain/repos/OnlineSourcesDataSource;", "offlineSourcesDataSource", "Lcom/route/domain/repos/OfflineSourcesDataSource;", "networkHandler", "Lcom/route/data/NetworkHandler;", "(Lcom/route/domain/repos/OnlineSourcesDataSource;Lcom/route/domain/repos/OfflineSourcesDataSource;Lcom/route/data/NetworkHandler;)V", "getSources", "", "Lcom/route/domain/entities/SourceItemDTO;", "categoryId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class SourcesRepositoryImpl implements com.route.domain.repos.SourcesRepository {
    private final com.route.domain.repos.OnlineSourcesDataSource onlineSourcesDataSource = null;
    private final com.route.domain.repos.OfflineSourcesDataSource offlineSourcesDataSource = null;
    private final com.route.data.NetworkHandler networkHandler = null;
    
    @javax.inject.Inject
    public SourcesRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.route.domain.repos.OnlineSourcesDataSource onlineSourcesDataSource, @org.jetbrains.annotations.NotNull
    com.route.domain.repos.OfflineSourcesDataSource offlineSourcesDataSource, @org.jetbrains.annotations.NotNull
    com.route.data.NetworkHandler networkHandler) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @java.lang.Override
    public java.lang.Object getSources(@org.jetbrains.annotations.NotNull
    java.lang.String categoryId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.route.domain.entities.SourceItemDTO>> continuation) {
        return null;
    }
}