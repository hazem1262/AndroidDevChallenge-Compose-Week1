package com.example.androiddevchallenge.ui.screens.list

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.androiddevchallenge.data.dogs.getDogsBreedList
import com.example.androiddevchallenge.utils.composables.BreedListItem
import com.example.androiddevchallenge.utils.composables.ListScreenAppBar
import androidx.compose.foundation.lazy.items


@Composable
fun DogsBreedListScreen(
    onBreedClick: (Int) -> Unit
) {
    val breedList = getDogsBreedList()

    Scaffold(
        topBar = {
            ListScreenAppBar()
        }
    ) {
        LazyColumn {
            items(breedList) { breed ->
                BreedListItem(breed = breed, onBreedClick = onBreedClick)
            }
        }
    }
}