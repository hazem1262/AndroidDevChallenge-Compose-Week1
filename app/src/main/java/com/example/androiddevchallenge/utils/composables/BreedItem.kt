/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.utils.composables

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.dogs.DogsBreed
import com.example.androiddevchallenge.ui.theme.green
import com.example.androiddevchallenge.ui.theme.purple700
import com.example.androiddevchallenge.ui.theme.red
import dev.chrisbanes.accompanist.coil.CoilImage

@Composable
fun BreedListItem(
    breed: DogsBreed,
    onBreedClick: (Int) -> Unit
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp, horizontal = 16.dp)
            .clickable { onBreedClick(breed.id) }
    ) {
        Box(
            modifier = Modifier
                .size(96.dp)
                .clip(CircleShape)
                .border(width = 4.dp, color = purple700, shape = CircleShape)
        ) {
            CoilImage(
                data = breed.url,
                contentDescription = "dogs breed Image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.padding(8.dp).clip(CircleShape)
            )
        }

        Spacer(modifier = Modifier.size(16.dp))

        Column(modifier = Modifier.padding(4.dp)) {
            Text(text = breed.name, style = MaterialTheme.typography.body1)
            Text(
                text = breed.bredFor,
                style = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Medium)
            )
            Spacer(modifier = Modifier.size(4.dp))
            ChipsRow(breed = breed)
        }
    }
}

@Composable
fun ChipsRow(
    breed: DogsBreed
) {
    Row {

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .background(color = red.copy(alpha = 0.2f))
        ) {
            Text(
                text = breed.lifeSpan,
                style = MaterialTheme.typography.body2,
                color = red,
                modifier = Modifier.padding(vertical = 4.dp, horizontal = 12.dp)
            )
        }
        Spacer(modifier = Modifier.size(8.dp))

        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(50))
                .background(color = green.copy(alpha = 0.2f))
        ) {
            Text(
                text = breed.bredGroup,
                style = MaterialTheme.typography.body2,
                color = green,
                modifier = Modifier.padding(vertical = 4.dp, horizontal = 12.dp)
            )
        }
    }
}
