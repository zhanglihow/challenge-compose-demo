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

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.DogData
import com.example.androiddevchallenge.model.DogModel
import com.example.androiddevchallenge.ui.theme.teal200
import com.example.androiddevchallenge.ui.theme.typography

@Composable
fun DogDetailPage(
    navController: NavHostController,
    index: String = "0",
    onAdopt: (DogData) -> Unit = {}
) {
    val dog = DogModel.dogs[index.toInt()]

    Surface(color = teal200, modifier = Modifier.fillMaxHeight()) {
        Column {
            Box(modifier = Modifier.padding(5.dp)) {
                DogItem(dog, navController, index.toInt(), 500)
            }
            Text(
                text = "Details",
                style = typography.body2,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 10.dp)
            )
            Text(
                text = dog.feature,
                style = typography.body1,
                modifier = Modifier.padding(horizontal = 10.dp)
            )
            Button(
                onClick = {
                    onAdopt(dog)
                },
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth()
            ) {
                Text("Adopt", modifier = Modifier.padding(8.dp))
            }
        }
    }
}
