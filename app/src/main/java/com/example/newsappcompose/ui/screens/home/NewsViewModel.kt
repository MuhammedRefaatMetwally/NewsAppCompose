package com.example.newsappcompose.ui.screens.home

import android.util.Log
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.newsappcompose.api.model.Category
import com.example.newsappcompose.api.model.newsResponse.News
import com.example.newsappcompose.api.model.sourceResponse.Source
import com.example.newsappcompose.domain.repo.NewsRepository
import com.example.newsappcompose.domain.repo.SourceRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
    private val sourceRepo: SourceRepository,
    private val newsRepo: NewsRepository,
) : ViewModel() {
    val sourcesList: MutableState<List<Source?>?> = mutableStateOf(emptyList())
    val sourceNews: MutableState<Source> = mutableStateOf(Source())

    val newsList: MutableState<List<News?>?> = mutableStateOf(emptyList())
    val searchList: MutableState<List<News?>?> = mutableStateOf(emptyList())
    val isLoading: MutableState<Boolean> = mutableStateOf(false)
    var selectedIndex = mutableIntStateOf(0)
    val pageSize = mutableIntStateOf(20)
    var page = mutableIntStateOf(1)


    fun getSourcesByCategory(category: String?, sourcesList: MutableState<List<Source?>?>) {

        viewModelScope.launch {
            isLoading.value = true
            try {
                val sources = sourceRepo.getSource(category = category ?: "sport")
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
        source: Source?,
        newsList: MutableState<List<News?>?>,
        searchText: MutableState<String> = mutableStateOf("")
    ) {
        viewModelScope.launch {
            isLoading.value = true
            try {
                val articleList = newsRepo.getNews(source?.id ?: "")
                newsList.value = articleList
            } catch (e: Exception) {
                Log.d("TAG", "getNewsBySources: ${e.localizedMessage?.toString()}")
            } finally {
                isLoading.value = false
            }
        }
        isLoading.value = false
    }

    fun getNewsBySearch(searchText: MutableState<String>, searchList: MutableState<List<News?>?>) {
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
        }
    }



