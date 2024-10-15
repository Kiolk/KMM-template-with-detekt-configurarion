package com.github.kiolk

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform