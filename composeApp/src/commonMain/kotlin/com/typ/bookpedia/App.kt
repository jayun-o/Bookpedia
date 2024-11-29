package com.typ.bookpedia

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.typ.bookpedia.book.data.network.KtorRemoteBookDataSource
import com.typ.bookpedia.book.data.repository.DefaultBookRepository
import com.typ.bookpedia.book.presentation.book_list.BookListScreenRoot
import com.typ.bookpedia.book.presentation.book_list.BookListViewModel
import com.typ.bookpedia.core.data.HttpClientFactory
import io.ktor.client.engine.HttpClientEngine
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App(engine: HttpClientEngine) {
    BookListScreenRoot(
       viewModel = remember { BookListViewModel(
           bookRepository = DefaultBookRepository(
               remoteBookDataSource = KtorRemoteBookDataSource(
                   httpClient = HttpClientFactory.create(engine)
               )
           )
       ) },
        onBookClick = {

        }
    )
}