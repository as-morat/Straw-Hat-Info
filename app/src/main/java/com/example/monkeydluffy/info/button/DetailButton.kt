package com.example.monkeydluffy.info.button

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    color: Brush,
    icon: ImageVector?,
    enabled: Boolean,
    iconOnRight: Boolean
) {
    val bgColor = color
    val textColor = Color.White

    Box(
        modifier
            .fillMaxWidth()
            .height(50.dp)
            .padding(horizontal = 12.dp)
            .clip(RoundedCornerShape(28.dp))
            .background(bgColor)
            .let {
                if (enabled) it.clickable { onClick() } else it
            },
        contentAlignment = Alignment.Center
    ) {
        Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center) {
            if (icon != null && !iconOnRight) {
                Icon(
                    icon,
                    contentDescription = "icon",
                    modifier = Modifier.padding(end = 8.dp),
                    tint = textColor
                )
            }
            Text(
                text = text,
                color = textColor,
                fontSize = 18.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
            )
            if (icon != null && iconOnRight) {
                Icon(
                    icon,
                    contentDescription = "icon",
                    modifier = Modifier.padding(start = 8.dp),
                    tint = textColor
                )
            }
        }
    }
}


@Composable
fun SafeButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    color: Brush = Brush.linearGradient(listOf(Color(0xff3e5151), Color(0xffdecba4))),
    icon: ImageVector? = null,
    enabled: Boolean = true,
    resetOnRecomposition: Boolean = true,
    iconOnRight: Boolean = false
) {
    var isClicked by remember { mutableStateOf(false) }

    // Reset click state on recomposition if needed
    if (resetOnRecomposition) {
        isClicked = false
    }

    CustomButton(
        modifier = modifier,
        text = text,
        color = color,
        icon = icon,
        enabled = enabled,
        onClick = {
            if (!isClicked && enabled) {
                isClicked = true
                onClick()
            }
        },
        iconOnRight = iconOnRight
    )
}
