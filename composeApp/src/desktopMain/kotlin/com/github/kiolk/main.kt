package com.github.kiolk

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KMM Detekt Configuration",
    ) {
        App()
    }
}