package com.typ.bookpedia

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform