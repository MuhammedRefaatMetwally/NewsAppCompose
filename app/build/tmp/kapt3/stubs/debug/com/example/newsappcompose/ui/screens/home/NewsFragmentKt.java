package com.example.newsappcompose.ui.screens.home;

import android.util.Log;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.material.icons.Icons;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.navigation.NavHostController;
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi;
import com.example.newsappcompose.R;
import com.example.newsappcompose.ui.navigation_component.NewsScreens;
import com.route.data.models.Source;
import com.route.domain.entities.ArticlesItemDTO;
import com.route.domain.entities.SourceItemDTO;
import dagger.hilt.android.AndroidEntryPoint;
import java.util.Locale;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a3\u0010\u0006\u001a\u00020\u00012\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0007\u00a2\u0006\u0002\u0010\r\u001a>\u0010\u000e\u001a\u00020\u00012\u000e\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00102\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0010H\u0007\u001a<\u0010\u0015\u001a\u00020\u00012\u0010\u0010\u0016\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0017\u0018\u00010\u00102\u0016\u0010\u0018\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00100\u00122\b\b\u0002\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u0019"}, d2 = {"NewsCard", "", "article", "Lcom/route/domain/entities/ArticlesItemDTO;", "navController", "Landroidx/navigation/NavHostController;", "NewsFragment", "category", "", "viewModel", "Lcom/example/newsappcompose/ui/screens/home/NewsViewModel;", "catName", "", "(Ljava/lang/String;Lcom/example/newsappcompose/ui/screens/home/NewsViewModel;Landroidx/navigation/NavHostController;Ljava/lang/Integer;)V", "NewsList", "news", "", "isSearching", "Landroidx/compose/runtime/MutableState;", "", "searchNews", "NewsSourcesTabs", "sourcesItemsList", "Lcom/route/domain/entities/SourceItemDTO;", "newsList", "app_debug"})
public final class NewsFragmentKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void NewsFragment(@org.jetbrains.annotations.Nullable
    java.lang.String category, @org.jetbrains.annotations.NotNull
    com.example.newsappcompose.ui.screens.home.NewsViewModel viewModel, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.Nullable
    java.lang.Integer catName) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NewsList(@org.jetbrains.annotations.NotNull
    java.util.List<com.route.domain.entities.ArticlesItemDTO> news, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.Boolean> isSearching, @org.jetbrains.annotations.NotNull
    java.util.List<com.route.domain.entities.ArticlesItemDTO> searchNews) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi.class})
    public static final void NewsCard(@org.jetbrains.annotations.NotNull
    com.route.domain.entities.ArticlesItemDTO article, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    @androidx.compose.runtime.Composable
    public static final void NewsSourcesTabs(@org.jetbrains.annotations.Nullable
    java.util.List<com.route.domain.entities.SourceItemDTO> sourcesItemsList, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.util.List<com.route.domain.entities.ArticlesItemDTO>> newsList, @org.jetbrains.annotations.NotNull
    com.example.newsappcompose.ui.screens.home.NewsViewModel viewModel) {
    }
}