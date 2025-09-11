package com.example.monkeydluffy.home.title

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Title(
    gradients: List<Forth<String, Color, Color, Color>> = listOf(
        // Main One Piece Title
        Forth(
            "ONE PIECE",
            Color(0xFF005C97),  // Deep Ocean Blue
            Color(0xFFFF512F),  // Sunset Orange
            Color(0xFFFFD700),  // Treasure Gold
        ),
        // Crew (Straw Hats)
        Forth(
            "STRAW HATS",
            Color(0xFF191654),  // Midnight Navy
            Color(0xFF43C6AC),  // Sea Green
            Color(0xFFD9D9D9),  // Faded Pirate Flag White
        )
    ),
    fontSize: Int = 56,
    fontWeight: FontWeight = FontWeight.ExtraBold
) {
    Row (
        Modifier.fillMaxWidth(),
        Arrangement.Center,
        Alignment.CenterVertically
    ){
        Column(
            modifier = Modifier,
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            gradients.forEachIndexed { index, (text, start, middle, end) ->
                Text(
                    text = text,
                    style = TextStyle(
                        brush = Brush.linearGradient(
                            listOf(start, middle, end)
                        ),
                        fontSize = if (index == 0) fontSize.sp  else 42.sp,
                        fontWeight = if (index == 0) FontWeight.ExtraBold  else FontWeight.SemiBold,
                        textAlign = TextAlign.Center
                    )
                )
            }
        }
    }
}