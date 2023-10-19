package com.example.newsappcompose.ui.screens.home

import androidx.compose.runtime.MutableState
import com.route.domain.entities.ArticlesItemDTO
import com.route.domain.entities.SourceItemDTO

//MVI
class NewsContract {

    interface ViewModel {
        val state: MutableState<State>
        val events: MutableState<Event>
        fun handleActions(actions: Actions)
    }

    sealed interface State {
        object Idle : State
        object Loading : State
        class Loaded(
            val sourcesList: List<SourceItemDTO>,
            val newsList: List<ArticlesItemDTO>
        ) : State

        class Error(val message: String) : State
    }

    sealed interface Event {
        object Idle : Event
        object NavigateToArticleDetails : Event
    }


    sealed interface Actions {
        class GetNewsSources(val categoryID: String) : Actions
        class GetNewsArticles(val sourceID: String) : Actions
        class ClickedOnNewsArticlesItem(val articlesItemDTO: ArticlesItemDTO) : Actions
    }

}