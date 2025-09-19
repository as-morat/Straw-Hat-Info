package com.example.monkeydluffy.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.monkeydluffy.R
import com.example.monkeydluffy.detail.custom.CustomItem
import com.example.monkeydluffy.home.title.Forth
import com.example.monkeydluffy.home.title.Title
import com.example.monkeydluffy.info.data.CharacterRepo
import com.example.monkeydluffy.ui.theme.one_pieceBG

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    onBackPressed: () -> Unit = {},
    onDetail: (Int) -> Unit = {}
) {
    val repo = CharacterRepo

    // Gradient Title setup
    val title = listOf(
        Forth(
            "STRAW HATS",
            Color(0xFF191654),  // Midnight Navy
            Color(0xFF43C6AC), // Sea Green
            Color(0xFFD9D9D9)     // Faded Pirate Flag White
        )
    )

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Title(
                            title,
                            fontSize = 30,
                            fontWeight = FontWeight.ExtraBold,
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackPressed) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_back_arrow),
                            contentDescription = "Back",
                            modifier = Modifier.size(28.dp),
                            colorFilter = ColorFilter.tint(Color(0xFF191654))
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color(0xFF3E2723)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp)
            )
        },
        content = { innerPadding ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(brush = one_pieceBG)
                    .padding(innerPadding)
            ) {
                LazyColumn(
                    contentPadding = PaddingValues(vertical = 16.dp),
                    verticalArrangement = Arrangement.spacedBy(14.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(
                        items = repo.Characters,
                        key = { character -> character.id }
                    ) { character ->
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(horizontal = 16.dp)
                                .border(
                                    width = 1.dp,
                                    color = Color(0xFFB0BEC5),
                                    shape = RoundedCornerShape(14.dp)
                                )
                                .background(
                                    color = Color(0x66FFFFFF),
                                    shape = RoundedCornerShape(14.dp)
                                )
                        ) {
                            CustomItem(character) { onDetail(character.id) }
                        }
                    }
                }
            }
        }
    )
}
