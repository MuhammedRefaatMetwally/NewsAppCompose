package com.example.newsappcompose.ui.screens.home;

import android.util.Log;
import androidx.compose.runtime.MutableState;
import androidx.lifecycle.ViewModel;
import com.route.data.models.ArticlesItem;
import com.route.data.models.Source;
import com.route.domain.entities.ArticlesItemDTO;
import com.route.domain.entities.SourceItemDTO;
import com.route.domain.repos.NewsRepository;
import com.route.domain.repos.SourcesRepository;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J8\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u001d2\u0016\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\b2\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\bJ(\u0010$\u001a\u00020 2\b\u0010%\u001a\u0004\u0018\u00010#2\u0016\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\f0\bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\nR!\u0010\u000b\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R!\u0010\u0017\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\nR\u001a\u0010\u0019\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0012\"\u0004\b\u001b\u0010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R!\u0010\u001c\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u001d\u0018\u00010\f0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\n\u00a8\u0006&"}, d2 = {"Lcom/example/newsappcompose/ui/screens/home/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "sourceRepo", "Lcom/route/domain/repos/SourcesRepository;", "newsRepo", "Lcom/route/domain/repos/NewsRepository;", "(Lcom/route/domain/repos/SourcesRepository;Lcom/route/domain/repos/NewsRepository;)V", "isLoading", "Landroidx/compose/runtime/MutableState;", "", "()Landroidx/compose/runtime/MutableState;", "newsList", "", "Lcom/route/domain/entities/ArticlesItemDTO;", "getNewsList", "page", "Landroidx/compose/runtime/MutableIntState;", "getPage", "()Landroidx/compose/runtime/MutableIntState;", "setPage", "(Landroidx/compose/runtime/MutableIntState;)V", "pageSize", "getPageSize", "searchList", "getSearchList", "selectedIndex", "getSelectedIndex", "setSelectedIndex", "sourcesList", "Lcom/route/domain/entities/SourceItemDTO;", "getSourcesList", "getNewsBySources", "", "source", "searchText", "", "getSourcesByCategory", "category", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    private final com.route.domain.repos.SourcesRepository sourceRepo = null;
    private final com.route.domain.repos.NewsRepository newsRepo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.SourceItemDTO>> sourcesList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.ArticlesItemDTO>> newsList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.ArticlesItemDTO>> searchList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> isLoading = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableIntState selectedIndex;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableIntState pageSize = null;
    @org.jetbrains.annotations.NotNull
    private androidx.compose.runtime.MutableIntState page;
    
    @javax.inject.Inject
    public NewsViewModel(@org.jetbrains.annotations.NotNull
    com.route.domain.repos.SourcesRepository sourceRepo, @org.jetbrains.annotations.NotNull
    com.route.domain.repos.NewsRepository newsRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.SourceItemDTO>> getSourcesList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.ArticlesItemDTO>> getNewsList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.ArticlesItemDTO>> getSearchList() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<java.lang.Boolean> isLoading() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableIntState getSelectedIndex() {
        return null;
    }
    
    public final void setSelectedIndex(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableIntState p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableIntState getPageSize() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableIntState getPage() {
        return null;
    }
    
    public final void setPage(@org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableIntState p0) {
    }
    
    public final void getSourcesByCategory(@org.jetbrains.annotations.Nullable
    java.lang.String category, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.SourceItemDTO>> sourcesList) {
    }
    
    public final void getNewsBySources(@org.jetbrains.annotations.Nullable
    com.route.domain.entities.SourceItemDTO source, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.ArticlesItemDTO>> newsList, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> searchText) {
    }
}