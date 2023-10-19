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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject


@HiltViewModel
class NewsViewModel @Inject constructor(
    private val sourceRepo: SourcesRepository,
    private val newsRepo: NewsRepository,
) : ViewModel(),NewsContract.ViewModel {

    private val _states = mutableStateOf<NewsContract.State>(NewsContract.State.Idle)
    override val state: MutableState<NewsContract.State> get() = _states

    private val _events = mutableStateOf<NewsContract.Event>(NewsContract.Event.Idle)

    override val events: MutableState<NewsContract.Event>
        get() = _events


    override fun handleActions(actions: NewsContract.Actions) {
       when(actions){
           is NewsContract.Actions.GetNewsSources -> {
               getNewsSources(category = actions.categoryID){
                   handleActions(NewsContract.Actions.GetNewsArticles(it))//
               }
           }
           is NewsContract.Actions.GetNewsArticles -> {
               val sourceItemDTO = SourceItemDTO(id = actions.sourceID)
               getNewsBySource(sourceItem =sourceItemDTO)
           }
           is NewsContract.Actions.ClickedOnNewsArticlesItem -> {

           }
       }
    }

    val selectedIndex = mutableIntStateOf(0)

    val sourcesList = mutableStateOf<List<SourceItemDTO>>((listOf()))
    private fun getNewsSources(category: String?, onSourceResponse: (String) -> Unit) {
        _states.value = NewsContract.State.Loading
        viewModelScope.launch {
            try {
                val response = sourceRepo.getSources(category ?: "")
                onSourceResponse(response[0].id)
                _states.value = NewsContract.State.Loaded(response, listOf())
                sourcesList.value = response ?: listOf()
            } catch (ex: Exception) {
                _states.value = NewsContract.State.Error(ex.localizedMessage ?: "Error Occurred")
            }
        }
    }

private fun getNewsBySource(
    sourceItem: SourceItemDTO,
) {
    _states.value = NewsContract.State.Loading
    viewModelScope.launch(Dispatchers.IO) {
        try {
            val result = newsRepo.getNewsData(sourceId = sourceItem.id)
            _states.value = NewsContract.State.Loaded(sourcesList.value, newsList = result)
        } catch (e: Exception) {
            _states.value = NewsContract.State.Error(e.localizedMessage ?: "Error Occurred")
        }
    }
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



