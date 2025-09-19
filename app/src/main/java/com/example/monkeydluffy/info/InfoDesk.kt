package com.example.monkeydluffy.info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.ExitToApp
import com.example.monkeydluffy.info.button.SafeButton
import com.example.monkeydluffy.info.data.Character
import com.example.monkeydluffy.info.data.CharacterRepo
import com.example.monkeydluffy.info.image.FrontImage
import com.example.monkeydluffy.info.text.DetailInfo
import com.example.monkeydluffy.ui.theme.one_pieceBG

@Composable
fun InfoDeskScreen(
    character: Character? = null,
    onBack: () -> Unit = {},
    onNext: () -> Unit = {},
    onPrev: () -> Unit = {},
    canGoNext: Boolean = true,
    canGoPrev: Boolean = true
) {
    val scrollState = rememberScrollState()
    val displayCharacter = character ?: CharacterRepo.Characters.first()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = one_pieceBG),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(horizontal = 20.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            // -------------------
            // Character Image
            // -------------------
            FrontImage(
                imageUrl = displayCharacter.imageUrl,
                description = displayCharacter.description
            )

            Spacer(modifier = Modifier.height(24.dp))

            // -------------------
            // Description Card
            // -------------------
            DetailInfo(
                text = displayCharacter.descriptionText,
                expandText = displayCharacter.expendableText,
                gradients = displayCharacter.gradients
            )

            Spacer(modifier = Modifier.height(36.dp))

            // -------------------
            // Prev & Next Buttons
            // -------------------
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                SafeButton(
                    text = "Prev",
                    onClick = onPrev,
                    color = Brush.linearGradient(
                        listOf(Color(0xFF2E1437), Color(0xFF808080))
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .height(54.dp),
                    icon = Icons.Default.ArrowBack,
                    enabled = canGoPrev
                )

                SafeButton(
                    text = "Next",
                    onClick = onNext,
                    color = Brush.linearGradient(
                        listOf(Color(0xFF808080), Color(0xFF2E1437))
                    ),
                    modifier = Modifier
                        .weight(1f)
                        .height(54.dp),
                    icon = Icons.Default.ArrowForward,
                    enabled = canGoNext,
                    iconOnRight = true
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            // -------------------
            // Back Button
            // -------------------
            SafeButton(
                text = "Back",
                onClick = onBack,
                color = Brush.linearGradient(
                    listOf(Color(0xFF373b44), Color(0xFFabbaab))
                ),
                modifier = Modifier
                    .width(220.dp)
                    .height(54.dp),
                icon = Icons.Default.ExitToApp
            )
        }
    }
}