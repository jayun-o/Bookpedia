package com.typ.bookpedia.book.presentation.book_detail.components

import com.typ.bookpedia.book.domain.Book

data class BookDetailState(
    val isLoading: Boolean = true,
    val isFavorite: Boolean = false,
    val book: Book? = null
)
