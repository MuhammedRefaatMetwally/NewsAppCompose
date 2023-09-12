package com.example.newsappcompose.ui.navigation_component

enum class NewsScreens {
    SplashScreen,
    CategoriesScreen,
    HomeScreen,
    HomeDetailsScreen,
    SettingScreen;

    companion object {

        fun fromRoute(route : String?) : NewsScreens =
            when(route?.substringBefore("/")){
                SplashScreen.name -> SplashScreen
                CategoriesScreen.name -> CategoriesScreen
                HomeScreen.name -> HomeScreen
                HomeDetailsScreen.name ->  HomeDetailsScreen
                SettingScreen.name -> SettingScreen
                null -> HomeScreen
                else -> throw IllegalArgumentException("Route $route is not recognized")
        }

    }
}