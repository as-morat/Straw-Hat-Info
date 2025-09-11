package com.example.monkeydluffy.info.data

import androidx.compose.ui.graphics.Color

data class Character(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val description: String,
    val descriptionText: String,
    val expendableText: String,
    val gradients: List<Triple<String, Color, Color>>
)
