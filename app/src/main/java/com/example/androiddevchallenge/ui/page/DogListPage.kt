package com.example.androiddevchallenge.ui.page

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.DogModel
import com.example.androiddevchallenge.ui.theme.teal200


/**
 *
 * @author zhangli
 * @email zhanglihow@gmail.com
 * @time
 */
@ExperimentalFoundationApi
@Composable
fun DogListPage (navController: NavHostController){
    Surface(color = teal200) {
        Row {
            LazyVerticalGrid(
                cells = GridCells.Fixed(2),
                contentPadding = PaddingValues(5.dp),
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                itemsIndexed(DogModel.dogs) { index, dog ->
                    DogItem(dog, navController, index,250)
                }
            }
        }
    }
}