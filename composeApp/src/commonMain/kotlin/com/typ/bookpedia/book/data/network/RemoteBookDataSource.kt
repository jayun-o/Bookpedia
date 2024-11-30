package com.typ.bookpedia.book.data.network

import com.typ.bookpedia.book.data.dto.BookWorkDto
import com.typ.bookpedia.book.data.dto.SearchResponseDto
import com.typ.bookpedia.core.domain.DataError
import com.typ.bookpedia.core.domain.Result

interface RemoteBookDataSource {
    suspend fun searchBooks(
        query: String,
        resultLimit: Int? = null
    ): Result<SearchResponseDto, DataError.Remote>

    suspend fun getBookDetails(bookWorkId: String): Result<BookWorkDto, DataError.Remote>
}