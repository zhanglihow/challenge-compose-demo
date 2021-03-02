package com.example.androiddevchallenge.model

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.compose.runtime.setValue
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.DogData


/**
 *
 * @author zhangli
 * @email zhanglihow@gmail.com
 * @time
 */
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
                ),
            )
        )
    }
}