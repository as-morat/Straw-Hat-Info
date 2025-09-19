package com.example.monkeydluffy.ui.theme

import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

val Purple80 = Color(0xFFD0BCFF)
val PurpleGrey80 = Color(0xFFCCC2DC)
val Pink80 = Color(0xFFEFB8C8)

val Purple40 = Color(0xFF6650a4)
val PurpleGrey40 = Color(0xFF625b71)
val Pink40 = Color(0xFF7D5260)

val one_pieceBG = Brush.linearGradient(
    listOf(
        Color(0xFFFFEFBA),
        Color(0xFFFFFFFF)
    )
)

val onSelectRowColor = Brush.linearGradient(
    listOf(
        Color(0xFFFFA751).copy(.9f),
        Color(0xFFFFD452).copy(.8f),
        Color(0xFFFFEFBA).copy(.7f)
    )
)

val onRowColor = Brush.linearGradient(
    listOf(
        Color.Transparent,
        Color.Transparent
    )
)

val onSelectTextColor = Brush.linearGradient(
    listOf(
//        Color(0xFFFFA751),
//        Color(0xFFFFD452),
//        Color(0xFFFFEFBA)
        Color(0xFF191654),  // Midnight Navy
        Color(0xFF43C6AC),  // Sea Green
    )
)
val onTextColor = Brush.linearGradient(
    listOf(
        Color.White,
        Color.White
    )
)
