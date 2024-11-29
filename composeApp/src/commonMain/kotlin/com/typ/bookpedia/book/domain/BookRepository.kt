package com.typ.bookpedia.book.domain

import com.typ.bookpedia.core.domain.DataError
import com.typ.bookpedia.core.domain.Result

interface BookRepository {
    suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote>
}