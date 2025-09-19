package com.example.monkeydluffy.detail.custom

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.example.monkeydluffy.info.data.Character
import com.example.monkeydluffy.ui.theme.onRowColor
import com.example.monkeydluffy.ui.theme.onSelectRowColor
import com.example.monkeydluffy.ui.theme.onSelectTextColor
import com.example.monkeydluffy.ui.theme.onTextColor
import kotlinx.coroutines.delay

@Composable
fun CustomItem(
    character: Character,
    modifier: Modifier = Modifier,
    onClick: () -> Unit
) {

    var select by remember { mutableStateOf(false) }
    val textColor = if (select) onTextColor else onSelectTextColor
    var isClickable by remember { mutableStateOf(true) }

    val launcher = LaunchedEffect(Unit) {
        delay(30)
        isClickable = true
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(
                brush = if (select) onSelectRowColor else onRowColor,
                shape = RoundedCornerShape(12.dp)
            )
            .animateContentSize(
                tween(
                    300,
                    easing = FastOutSlowInEasing
                )
            )
            .clickable(enabled = isClickable) {
                if (isClickable) {
                    isClickable = false
                    onClick()
                    select = !select
                    launcher
                }
            }
            .padding(24.dp),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        // Character Info
        Column(
            modifier = Modifier.weight(1f),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = character.name,
                style = TextStyle(
                    fontSize = 28.sp,
                    fontWeight = FontWeight.SemiBold,
                    brush = textColor
                )
            )

            Text(
                text = character.descriptionText,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Medium,
                    brush = textColor
                )
            )
        }

        // Character Image
        AsyncImage(
            model = character.imageUrl,
            contentDescription = character.name,
            modifier = Modifier
                .clip(CircleShape)
                .width(80.dp)
                .height(80.dp)
                .border(1.dp, Color.DarkGray, CircleShape),
            contentScale = ContentScale.Crop
        )
    }
}
