package com.typ.bookpedia.di

import com.typ.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.typ.bookpedia.book.data.network.RemoteBookDataSource
import com.typ.bookpedia.book.domain.BookRepository
import com.typ.bookpedia.core.data.HttpClientFactory
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.bind
import org.koin.dsl.module
import com.typ.bookpedia.book.data.repository.DefaultBookRepository
import org.koin.core.module.dsl.viewModelOf
import com.typ.bookpedia.book.presentation.book_list.BookListViewModel
import org.koin.core.module.Module

expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    viewModelOf(::BookListViewModel)
}