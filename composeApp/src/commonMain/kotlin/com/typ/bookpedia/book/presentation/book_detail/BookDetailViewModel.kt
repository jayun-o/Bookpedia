package com.typ.bookpedia.book.presentation.book_detail

import androidx.lifecycle.ViewModel
import com.typ.bookpedia.book.presentation.book_detail.components.BookDetailAction
import com.typ.bookpedia.book.presentation.book_detail.components.BookDetailState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookDetailViewModel: ViewModel() {
    private val _state = MutableStateFlow(BookDetailState())
    val state = _state.asStateFlow()

    fun onAction(action: BookDetailAction){
        when(action){
            is BookDetailAction.OnSelectedBookChange ->{
                _state.update { it.copy(
                    book = action.book
                ) }
            }
            is BookDetailAction.OnFavoriteClick -> {

            }
            else -> Unit
        }
    }
}