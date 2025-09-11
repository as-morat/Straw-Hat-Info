package com.example.monkeydluffy.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.monkeydluffy.home.title.Title
import com.example.monkeydluffy.info.button.CustomButton
import com.example.monkeydluffy.info.image.FrontImage
import com.example.monkeydluffy.ui.theme.one_pieceBG


@Composable
fun HomeScreen(
    onClick: () -> Unit = {}
) {
    val scrollState = rememberScrollState()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(brush = one_pieceBG)
            .padding(top = 72.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(scrollState)
                .padding(horizontal = 8.dp)
        ) {
            Title()
            Spacer(Modifier.height(62.dp))

            FrontImage(
                "https://wallpapers.com/images/hd/one-piece-straw-hat-crew-sunset-z5j6a123tfeasheq.jpg",
                "Crew image"
            )
            Spacer(Modifier.height(62.dp))

            CustomButton(onClick = onClick, text = "Know Crew Members")
            Spacer(Modifier.height(62.dp))
        }
    }
}
