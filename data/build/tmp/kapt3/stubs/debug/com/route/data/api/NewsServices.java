package com.route.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J%\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\n\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000b"}, d2 = {"Lcom/route/data/api/NewsServices;", "", "getNewsBySource", "Lcom/route/data/models/NewsResponse;", "apiKey", "", "sources", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNewsSources", "Lcom/route/data/models/SourceResponse;", "category", "data_debug"})
public abstract interface NewsServices {
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "top-headlines/sources")
    public abstract java.lang.Object getNewsSources(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "category")
    java.lang.String category, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.route.data.models.SourceResponse> continuation);
    
    @org.jetbrains.annotations.Nullable
    @retrofit2.http.GET(value = "everything")
    public abstract java.lang.Object getNewsBySource(@org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "apiKey")
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    @retrofit2.http.Query(value = "sources")
    java.lang.String sources, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.route.data.models.NewsResponse> continuation);
}