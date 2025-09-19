package com.example.monkeydluffy.info.text

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun DetailInfo(
    text: String = "Default Description...",
    expandText: String = "Default Expendable Text...",
    gradients: List<Triple<String, Color, Color>> = listOf(
        Triple("Monkey", Color(0xFFFF7F50), Color(0xFFFFD700)),
        Triple(" D. ", Color(0xFFFF0000), Color(0xFFFFA500)),
        Triple("Luffy", Color(0xFF00BFFF), Color(0xFF1E90FF))
    )
) {

    var expandable by remember { mutableStateOf(false) }
    val animateIcon by animateFloatAsState(
        targetValue = if (expandable) 180f else 0f,
        animationSpec = tween(200, easing = LinearOutSlowInEasing),
        label = "rotateIcon"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
            .animateContentSize(
                animationSpec = tween(
                    durationMillis = 300,
                    easing = LinearOutSlowInEasing
                )
            )
            .clickable { expandable = !expandable },
        shape = RoundedCornerShape(12.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFF3E5151)
        ),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        SelectionContainer {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalAlignment = Alignment.Start,
                verticalArrangement = Arrangement.Center
            ) {
                // Title with gradient text + dropdown
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    GradientTitle(gradients)

                    IconButton(
                        modifier = Modifier.rotate(animateIcon),
                        onClick = { expandable = !expandable }
                    ) {
                        Icon(
                            imageVector = Icons.Default.ArrowDropDown,
                            contentDescription = "DropDown Icon",
                            tint = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(12.dp))

                // Always visible text
                Text(
                    text = text,
                    color = Color.White.copy(alpha = 0.85f),
                    fontSize = 18.sp,
                    lineHeight = 22.sp
                )

                // Expandable text
                if (expandable) {
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = expandText,
                        color = Color.White.copy(alpha = 0.85f),
                        fontSize = 16.sp,
                        lineHeight = 22.sp
                    )
                }
            }
        }
    }
}



