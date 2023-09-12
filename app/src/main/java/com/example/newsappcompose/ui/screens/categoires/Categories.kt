package com.example.newsappcompose.ui.screens.categoires

import android.annotation.SuppressLint
import android.os.Build
import android.util.Log
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.newsappcompose.R
import com.example.newsappcompose.ui.navigation_component.NewsScreens
import com.example.newsappcompose.ui.screens.home.NewsFragment
import com.example.newsappcompose.ui.screens.home_details.HomeDetails
import com.example.newsappcompose.ui.screens.settings.Settings
import com.example.newsappcompose.ui.widgets.CategoriesContent
import com.route.newsappc38online.widgets.DrawerBody
import com.route.newsappc38online.widgets.DrawerHeader
import kotlinx.coroutines.launch

@RequiresApi(Build.VERSION_CODES.TIRAMISU)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoriesNews(mainController: NavHostController) {
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val navController = rememberNavController()
    val scope = rememberCoroutineScope()

    Box(modifier = with (Modifier){
        fillMaxSize()
            .paint(
                painter = painterResource(id = R.drawable.pattern),
                contentScale = ContentScale.FillBounds
            )
    } ){
        ModalNavigationDrawer(drawerContent = {
            Column(modifier = Modifier.fillMaxSize()) {
                DrawerHeader()
                DrawerBody(navController ,mainController= mainController) {
                    scope.launch {
                        drawerState.close()
                    }
                }
            }

        }, drawerState = drawerState) {
            Scaffold(
                topBar = { NewsAppBar(drawerState, title = stringResource(R.string.news_bar)) }
            ) {

                NavHost(
                    navController = navController,
                    startDestination = NewsScreens.CategoriesScreen.name
                ) {

                    composable(NewsScreens.CategoriesScreen.name) {
                        CategoriesContent(navController = navController)

                    }

                    composable(
                        NewsScreens.HomeScreen.name + "/{category}",
                        arguments = listOf(navArgument("category") {
                            type = NavType.StringType
                        })
                    ) {
                        val argument = it.arguments?.getString("category")
                        Log.d("test", argument.toString())
                        NewsFragment(argument, navController = navController)
                    }
                    composable(NewsScreens.HomeDetailsScreen.name){

                        HomeDetails(navController = navController)
                    }

                }

            }

        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsAppBar(drawerState: DrawerState, title: String) {
    val scope = rememberCoroutineScope()
    com.example.newsappcompose.ui.widgets.CustomAppBar(title = title,
        leadingIcon = {
        IconButton(onClick = {
            scope.launch {
                drawerState.open()
            }
        }) {
            Icon(
                modifier = Modifier
                    .width(32.dp)
                    .height(32.dp),
                painter = painterResource(id = R.drawable.ic_menu),
                contentDescription = "Icon Navigation"
            )

        }
    })

}