package com.example.newsappcompose.ui.screens.home

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.route.data.models.ArticlesItem
import com.route.data.models.Source
import com.route.domain.entities.ArticlesItemDTO
import com.route.domain.entities.SourceItemDTO
import com.route.domain.repos.NewsRepository
import com.route.domain.repos.SourcesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
    private val sourceRepo: SourcesRepository,
    private val newsRepo: NewsRepository,
) : ViewModel() {
    val sourcesList: MutableState<List<SourceItemDTO?>?> = mutableStateOf(emptyList())


    val newsList: MutableState<List<ArticlesItemDTO?>?> = mutableStateOf(emptyList())
    val searchList: MutableState<List<ArticlesItemDTO?>?> = mutableStateOf(emptyList())
    val isLoading: MutableState<Boolean> = mutableStateOf(false)
    var selectedIndex = mutableIntStateOf(0)
    val pageSize = mutableIntStateOf(20)
    var page = mutableIntStateOf(1)


    fun getSourcesByCategory(category: String?, sourcesList: MutableState<List<SourceItemDTO?>?>) {

        viewModelScope.launch {
            isLoading.value = true
            try {
                val sources = sourceRepo.getSources(categoryId = category ?: "sport")
                sourcesList.value = sources
            } catch (e: Exception) {
                Log.d("TAG", "getSourcesByCategory: ${e.localizedMessage?.toString()}")
            } finally {
                isLoading.value = false
            }
        }
        isLoading.value = false
    }

    fun getNewsBySources(
        source: SourceItemDTO?,
        newsList: MutableState<List<ArticlesItemDTO?>?>,
        searchText: MutableState<String> = mutableStateOf("")
    ) {
        viewModelScope.launch {
            isLoading.value = true
            try {
                val articleList = newsRepo.getNewsData(source?.id ?: "")
                newsList.value = articleList
            } catch (e: Exception) {
                Log.d("TAG", "getNewsBySources: ${e.localizedMessage?.toString()}")
            } finally {
                isLoading.value = false
            }
        }
        isLoading.value = false
    }

  /*  fun getNewsBySearch(searchText: MutableState<String>, searchList: MutableState<List<News?>?>) {
        viewModelScope.launch {
            isLoading.value = true
            try {
                val articlesList = newsRepo.getNewsBySearch(searchText.value)
                searchList.value = articlesList
            }catch (e : Exception){
                Log.d("TAG", "getNewsBySearch: ${e.localizedMessage?.toString()}")
            }finally {
                isLoading.value = false
            }
        }
        isLoading.value = false
        }*/
    }



