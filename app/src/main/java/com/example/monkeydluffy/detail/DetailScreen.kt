package com.example.monkeydluffy.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
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
    val title = listOf(
        Forth(
            "STRAW HAT'S  ",
            Color(0xFF191654),
            Color(0xFF43C6AC),
            Color(0xFFA1FFCE)
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
                            fontSize = 32,
                            fontWeight = FontWeight.Bold,
                        )
                    }
                },
                navigationIcon = {
                    IconButton(onClick = onBackPressed) {
                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_back_arrow),
                            contentDescription = "Back",
                            modifier = Modifier.size(24.dp),
                            colorFilter = ColorFilter.tint(Color(0xFF43C6AC))
                        )
                    }
                },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Color.Transparent,
                    titleContentColor = Color(0xffe8cbc0)
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 16.dp) // Add horizontal padding
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
                    verticalArrangement = Arrangement.spacedBy(8.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.fillMaxSize()
                ) {
                    items(items = repo.Characters, key = { character -> character.id }) { character ->
                        Box(modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 16.dp)
                            .background(
                                color = Color.White.copy(alpha = 0.1f),
                                shape = MaterialTheme.shapes.medium
                            )
                            .padding(6.dp)
                        ) {
                            CustomItem(character) { onDetail(character.id) }
                        }
                    }
                }
            }
        }
    )
}