package com.example.androiddevchallenge.utils.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ChevronLeft
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.ui.theme.purple700

@Composable
fun ListScreenAppBar() {
    TopAppBar {
        Row(
            modifier = Modifier.padding(start = 8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            IconButton(onClick = {}) {
                Icon(
                    imageVector = Icons.Default.Pets,
                    contentDescription = "Dogs Icon",
                    tint = purple700
                )
            }
            Text(
                text = "Dogs Breed",
                style = MaterialTheme.typography.h6
            )
        }
    }
}

@Composable
fun DetailsTopBar(
    onNavigateBack: () -> Unit
) {
    TopAppBar(
        elevation = 0.dp
    ) {
        IconButton(onClick = onNavigateBack) {
            Icon(
                imageVector = Icons.Default.ChevronLeft,
                contentDescription = "Back Icon",
                modifier = Modifier.size(32.dp)
            )
        }
    }
}