package com.example.monkeydluffy.info.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp
import java.lang.reflect.Modifier

@Composable
fun GradientTitle(
    gradients: List<Triple<String, Color, Color>>
) {
    Text(
        buildAnnotatedString {
            gradients.forEachIndexed { index, (text, color1, color2) ->

                val brush = Brush.linearGradient(
                    listOf(
                        color1,
                        color2
                    )
                )

                withStyle(
                    style = TextStyle(
                        brush = brush,
                        fontSize = if (index == 1) 32.sp else 28.sp,
                        fontWeight = if (index == 1) FontWeight.ExtraBold else FontWeight.SemiBold
                    ).toSpanStyle()
                ) {
                    append(text)
                }
            }
        }
    )
}

