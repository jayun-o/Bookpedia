package com.typ.bookpedia

import androidx.compose.ui.window.ComposeUIViewController

fun MainViewController() = ComposeUIViewController (
    configure = {
        initKoin()
    }
){ App() }