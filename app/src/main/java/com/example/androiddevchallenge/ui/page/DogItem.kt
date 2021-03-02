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
package com.example.androiddevchallenge.ui.page

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.data.DogData
import com.example.androiddevchallenge.ui.theme.accentPink
import com.example.androiddevchallenge.ui.theme.purple700
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogItem(
    dog: DogData,
    navController: NavHostController,
    index: Int,
    height: Int
) {
    Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.spacedBy((-15).dp),
            modifier = Modifier.clickable {
                navController.navigate("dogDetail/$index") {
                    popUpTo(route = "dogList") {}
                }
            },
        ) {
            Image(
                painter = painterResource(id = dog.photo),
                contentDescription = "Dog Pics",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(200.dp, height.dp)
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = Color.White,
                        shape = RoundedCornerShape(16.dp)
                    )
                    .padding(16.dp)
            ) {
                Column {
                    Text(text = dog.name, style = typography.body1, fontWeight = FontWeight.Bold)
                    Text(text = dog.feature, style = typography.overline)
                    Row(
                        horizontalArrangement = Arrangement.spacedBy(8.dp),
                        modifier = Modifier.padding(top = 4.dp)
                    ) {
                        Chip(content = dog.age)
                        Chip(content = dog.gender)
                        Chip(content = dog.weight.toString() + " KG")
                    }
                }
            }
        }
    }
}

@Composable
fun Chip(content: String) {
    Text(
        text = content,
        style = typography.caption,
        color = purple700,
        modifier = Modifier
            .background(color = accentPink, shape = RoundedCornerShape(6.dp))
            .padding(3.dp)
    )
}
