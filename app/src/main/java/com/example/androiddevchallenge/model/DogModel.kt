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
package com.example.androiddevchallenge.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.DogData

class DogModel : ViewModel() {
    companion object {
        val dogs by mutableStateOf(
            listOf(
                DogData(
                    "Hello",
                    R.drawable.dog1,
                    "2",
                    "boy",
                    "Small but beautiful and quiet",
                    8.5F,
                ),
                DogData(
                    "Ace",
                    R.drawable.dog7,
                    "0.5",
                    "girl",
                    "Lively, cute and docile",
                    19.5F,
                ),
                DogData(
                    "Sapp",
                    R.drawable.dog3,
                    "1",
                    "boy",
                    "Curious, obedient and lively",
                    12F,
                ),
                DogData(
                    "Strickland",
                    R.drawable.dog2,
                    "3",
                    "boy",
                    "Quiet and likes to run",
                    35F,
                ),
                DogData(
                    "Rain",
                    R.drawable.dog8,
                    "3",
                    "boy",
                    "Passionate about making friends",
                    15F,
                ),
                DogData(
                    "Ozark",
                    R.drawable.dog4,
                    "5",
                    "girl",
                    "Quiet and like to get along with people",
                    32F,
                ),
                DogData(
                    "Dolly",
                    R.drawable.dog5,
                    "1",
                    "girl",
                    "Like to play with people",
                    4.5F,
                ),
                DogData(
                    "Sacker",
                    R.drawable.dog6,
                    "4",
                    "boy",
                    "Run and be quiet",
                    39F,
                ),
                DogData(
                    "Barse",
                    R.drawable.dog9,
                    "2",
                    "boy",
                    "Lively and like to play games",
                    28.5F,
                )
            )
        )
    }
}