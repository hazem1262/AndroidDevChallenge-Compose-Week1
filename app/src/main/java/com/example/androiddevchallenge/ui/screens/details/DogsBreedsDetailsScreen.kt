package com.example.androiddevchallenge.ui.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Pets
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.dogs.getDogBreedById
import com.example.androiddevchallenge.ui.theme.pink
import com.example.androiddevchallenge.utils.composables.DetailsTopBar
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun DetailsScreen(
    breedId: Int,
    onNavigateBack: () -> Unit
) {
    val puppy = getDogBreedById(id = breedId)

    Scaffold(
        topBar = { DetailsTopBar(onNavigateBack = onNavigateBack) }
    ) {
        LazyColumn {
            item {
                CoilImage(
                    data = puppy?.url?:"",
                    contentDescription = "Puppy Image",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.aspectRatio(1.2f).fillMaxWidth()
                )
                Spacer(modifier = Modifier.size(8.dp))
            }

            item { PuppyName(puppy?.name?:"", puppy?.temperament?:"") }

            item { PuppyDescription(puppy?.name?:"", puppy?.bredGroup?:"") }
        }
    }
}

@Composable
fun PuppyName(name: String, type: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(vertical = 8.dp, horizontal = 16.dp)
    ) {
        Column {
            Text(text = name, style = MaterialTheme.typography.h6)
            Text(text = type, style = MaterialTheme.typography.subtitle1)
        }
        Spacer(modifier = Modifier.weight(1f))
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .background(color = pink)
                .clickable { /*ADOPT*/ }
        ) {
            Row(modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp)) {
                Icon(
                    imageVector = Icons.Default.Pets,
                    contentDescription = "Paw Icon",
                    tint = MaterialTheme.colors.primary
                )
                Spacer(modifier = Modifier.size(4.dp))
                Text(
                    text = "Adopt",
                    style = MaterialTheme.typography.button,
                    color = MaterialTheme.colors.primary
                )
            }
        }
    }
}

@Composable
fun PuppyDescription(name: String, description: String) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "More about $name", style = MaterialTheme.typography.h6)
        Spacer(modifier = Modifier.size(16.dp))
        Text(text = description)
    }
}