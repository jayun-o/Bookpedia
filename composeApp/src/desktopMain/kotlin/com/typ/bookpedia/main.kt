package com.typ.bookpedia

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.typ.bookpedia.di.initKoin

fun main() = application {
    initKoin()
    application {
        Window(
            onCloseRequest = ::exitApplication,
            title = "Bookpedia",
        ) {
            App()
        }
    }
}