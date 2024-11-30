package com.typ.bookpedia.book.data.repository

import com.typ.bookpedia.book.data.mappers.toBook
import com.typ.bookpedia.book.data.network.RemoteBookDataSource
import com.typ.bookpedia.book.domain.Book
import com.typ.bookpedia.book.domain.BookRepository
import com.typ.bookpedia.core.domain.DataError
import com.typ.bookpedia.core.domain.Result
import com.typ.bookpedia.core.domain.map

class DefaultBookRepository (
    private val remoteBookDataSource: RemoteBookDataSource
): BookRepository{
    override suspend fun searchBooks(query: String): Result<List<Book>,DataError.Remote>{
        return remoteBookDataSource
            .searchBooks(query)
            .map { dto ->
                dto.results.map { it.toBook() }
            }
    }

    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
        return remoteBookDataSource
            .getBookDetails(bookId)
            .map { it.description }
    }
}