package com.example.newsappcompose.ui.screens.categoires;

import android.annotation.SuppressLint;
import android.os.Build;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.DrawerValue;
import androidx.compose.material3.ExperimentalMaterial3Api;
import androidx.compose.runtime.Composable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.ContentScale;
import androidx.navigation.NavHostController;
import com.example.newsappcompose.R;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000<\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001aO\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0013\b\u0002\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00010\n\u00a2\u0006\u0002\b\u000b2\u001e\b\u0002\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r\u00a2\u0006\u0002\b\u000b\u00a2\u0006\u0002\b\u000fH\u0007\u001a \u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u00a8\u0006\u0013"}, d2 = {"CategoriesNews", "", "navController", "Landroidx/navigation/NavHostController;", "NewsAppBar", "drawerState", "Landroidx/compose/material3/DrawerState;", "title", "", "iconContent", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "trailingIcon", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/RowScope;", "Lkotlin/ExtensionFunctionType;", "NewsDrawer", "scope", "Lkotlinx/coroutines/CoroutineScope;", "app_debug"})
public final class CategoriesKt {
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    @android.annotation.SuppressLint(value = {"UnusedMaterial3ScaffoldPaddingParameter"})
    @androidx.annotation.RequiresApi(value = android.os.Build.VERSION_CODES.TIRAMISU)
    public static final void CategoriesNews(@org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void NewsDrawer(@org.jetbrains.annotations.NotNull
    androidx.compose.material3.DrawerState drawerState, @org.jetbrains.annotations.NotNull
    androidx.navigation.NavHostController navController, @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.CoroutineScope scope) {
    }
    
    @androidx.compose.runtime.Composable
    @kotlin.OptIn(markerClass = {androidx.compose.material3.ExperimentalMaterial3Api.class})
    public static final void NewsAppBar(@org.jetbrains.annotations.NotNull
    androidx.compose.material3.DrawerState drawerState, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function0<kotlin.Unit> iconContent, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super androidx.compose.foundation.layout.RowScope, kotlin.Unit> trailingIcon) {
    }
}