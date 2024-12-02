package com.typ.bookpedia.di

import androidx.sqlite.driver.bundled.BundledSQLiteDriver
import com.typ.bookpedia.book.data.database.DatabaseFactory
import com.typ.bookpedia.book.data.database.FavoriteBookDatabase
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
import com.typ.bookpedia.book.presentation.SelectedBookViewModel
import com.typ.bookpedia.book.presentation.book_detail.BookDetailViewModel


expect val platformModule: Module

val sharedModule = module {
    single { HttpClientFactory.create(get()) }
    singleOf(::KtorRemoteBookDataSource).bind<RemoteBookDataSource>()
    singleOf(::DefaultBookRepository).bind<BookRepository>()

    single {
        get<DatabaseFactory>().create()
            .setDriver(BundledSQLiteDriver())
            .build()
    }

    single{ get<FavoriteBookDatabase>().favoriteBooksDao }

    viewModelOf(::BookListViewModel)
    viewModelOf(::BookDetailViewModel)
    viewModelOf(::SelectedBookViewModel)

}