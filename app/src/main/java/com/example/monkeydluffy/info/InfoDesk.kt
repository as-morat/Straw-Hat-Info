package com.example.monkeydluffy.info

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.monkeydluffy.info.button.CustomButton
import com.example.monkeydluffy.info.data.Character
import com.example.monkeydluffy.info.data.CharacterRepo
import com.example.monkeydluffy.info.image.FrontImage
import com.example.monkeydluffy.info.text.DetailInfo
import com.example.monkeydluffy.ui.theme.one_pieceBG

@Composable
fun InfoDeskScreen(
    character: Character ?= null,
    onBack: () -> Unit = {},
    onDetail: () -> Unit = {}
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
                .padding(horizontal = 16.dp, vertical = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            FrontImage(
                imageUrl = displayCharacter.imageUrl,
                description = displayCharacter.description
            )

            Spacer(modifier = Modifier.height(12.dp))

            DetailInfo(
                text = displayCharacter.descriptionText,
                expandText = displayCharacter.expendableText,
                gradients = displayCharacter.gradients
            )

            Spacer(modifier = Modifier.height(42.dp))

            CustomButton(
                onClick = onDetail,
                modifier = Modifier.width(280.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))

            CustomButton(
                text = "Home",
                color = Brush.linearGradient(listOf(
                    Color(0xffd3cce3),
                    Color(0xff093637)
                )),
                onClick = onBack,
                modifier = Modifier.width(220.dp)
            )

            Spacer(modifier = Modifier.height(12.dp))
        }
    }
}
