package com.example.newsappcompose.ui.screens.home

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ScrollableTabRow
import androidx.compose.material3.Tab
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.newsappcompose.R
import com.example.newsappcompose.api.model.newsResponse.News
import com.example.newsappcompose.api.model.sourceResponse.Source
import com.example.newsappcompose.ui.navigation_component.NewsScreens
import com.example.newsappcompose.ui.screens.categoires.NewsAppBar
import com.example.newsappcompose.ui.widgets.CircularProgressAnimated
import com.example.newsappcompose.ui.widgets.CustomDrawer
import com.example.newsappcompose.ui.widgets.SearchBar
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NewsFragment(
    category: String?,
    viewModel: NewsViewModel = hiltViewModel(),
    navController: NavHostController,
    catName: Int?,
) {
    viewModel.getSourcesByCategory(category, viewModel.sourcesList)
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val isSearching = remember {
        mutableStateOf(false)
    }
    val searchText = remember {
        mutableStateOf("")
    }
    

    Box(modifier = with(Modifier) {
        fillMaxSize()
            .paint(painterResource(id = R.drawable.pattern), contentScale = ContentScale.FillBounds)
    }) {
        CustomDrawer(
            drawerState = drawerState, navController = navController,
            topBar = {
                if (isSearching.value) {
                    SearchBar(searchText = searchText.value,
                        placeholderText = stringResource(R.string.search_article),
                        onSearchTextChanged = { text ->
                            searchText.value = text
                            Log.d("text ", searchText.value)
                            viewModel.getNewsBySearch( searchList = viewModel.searchList,searchText = searchText)
                        },
                        onSearchClick = {
                            isSearching.value = true
                            viewModel.getNewsBySearch( searchList = viewModel.searchList,searchText = searchText)
                        },
                        onClose = {
                            isSearching.value = false
                        }
                    )
                } else {
                    NewsAppBar(
                        drawerState = drawerState,
                        title = stringResource(id = catName ?: R.string.news),
                        trailingIcon = {
                            IconButton(onClick = {
                                isSearching.value = !isSearching.value
                                Log.d("searching", isSearching.toString())
                            }) {
                                Icon(
                                    modifier = Modifier
                                        .width(32.dp)
                                        .height(32.dp),
                                    tint = Color.White,
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search Icon"
                                )
                            }
                        })
                }

            }
        ) {
            Column(modifier = Modifier
                .padding(top = 80.dp, bottom = 32.dp)
                .fillMaxSize()) {
                if(viewModel.isLoading.value){
                    CircularProgressAnimated(viewModel.isLoading.value)
                }else{

                    NewsSourcesTabs(viewModel.sourcesList.value, viewModel.newsList , viewModel)
                    NewsList(
                        searchNews = viewModel.searchList.value ?: emptyList(),
                        isSearching = isSearching,
                        news = viewModel.newsList.value ?: emptyList(),
                        navController = navController,
                    )
                }
            }
        }
    }

}

@Composable
fun NewsList(
    news: List<News?>,
    navController: NavHostController,
    isSearching: MutableState<Boolean>,
    searchNews: List<News?>,
) {
         if(isSearching.value){
             LazyColumn(modifier = Modifier.padding(vertical = 16.dp)) {
                 items(searchNews.size) {
                     NewsCard(article = searchNews[it] ?: News(), navController)
                 }
             }
         }else{
             LazyColumn(modifier = Modifier.padding(vertical = 16.dp)) {
                 items(news.size) {
                     NewsCard(article = news[it] ?: News(), navController)
                 }
             }

         }

}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun NewsCard(article: News, navController: NavHostController) {

    Card(
        modifier = Modifier
            .fillMaxWidth()

            .padding(16.dp)
            .clickable {
                navController.currentBackStackEntry?.savedStateHandle?.apply {
                    set("news", article)
                }
                navController.navigate(NewsScreens.HomeDetailsScreen.name)
            }
    ) {
        GlideImage(
            modifier = Modifier.height(256.dp),
            model = article.urlToImage,
            contentDescription = "news Image",
            contentScale = ContentScale.FillBounds
        )
        Text(
            text = article.source?.name ?: "",
            style = TextStyle(color = colorResource(id = R.color.authorColor))
        )
        Text(
            text = article.title ?: "",
            style = TextStyle(color = colorResource(id = R.color.titleColor))
        )
        Text(
            modifier = Modifier.align(alignment = Alignment.End),
            text = article.publishedAt ?: "",
            style = TextStyle(color = colorResource(id = R.color.dateColor))
        )
    }
}


@Composable
fun NewsSourcesTabs(
    sourcesItemsList: List<Source?>?,
    newsList: MutableState<List<News?>?>,
    viewModel: NewsViewModel = viewModel(),
) {

    if (sourcesItemsList!!.isNotEmpty())
        ScrollableTabRow(
            selectedTabIndex = viewModel.selectedIndex.intValue,
            containerColor = Color.Transparent,
            divider = {},
            indicator = {},
        ) {
            sourcesItemsList.forEachIndexed { index, sourceItem ->
                if (viewModel.selectedIndex.intValue == index) {
                    viewModel.getNewsBySources(source = sourceItem, newsList = newsList)
                }
                Tab(
                    selected = viewModel.selectedIndex.intValue == index,
                    onClick = {
                        viewModel.selectedIndex.intValue = index
                    },
                    selectedContentColor = Color.White,
                    unselectedContentColor = Color(0xFF39A552),
                    modifier = if (viewModel.selectedIndex.intValue == index)
                        Modifier
                            .padding(end = 2.dp)
                            .background(
                                Color(0xFF39A552),
                                RoundedCornerShape(50)
                            )
                    else
                        Modifier
                            .padding(end = 2.dp)
                            .border(2.dp, Color(0xFF39A552), RoundedCornerShape(50)),
                    text = { Text(text = sourceItem!!.name ?: "") }
                )


            }
        }
}

