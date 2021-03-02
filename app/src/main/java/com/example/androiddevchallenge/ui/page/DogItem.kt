package com.example.androiddevchallenge.ui.page

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.data.DogData
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.navigate
import androidx.navigation.compose.popUpTo
import com.example.androiddevchallenge.ui.theme.accentPink
import com.example.androiddevchallenge.ui.theme.purple700
import com.example.androiddevchallenge.ui.theme.typography
import com.google.android.material.chip.Chip

/**
 *
 * @author zhangli
 * @email zhanglihow@gmail.com
 * @time
 */
@Composable
fun DogItem(dog: DogData,
            navController: NavHostController,
            index: Int,
            height:Int){
    Card(
        elevation = 16.dp,
        shape = RoundedCornerShape(16.dp),
        modifier = Modifier
            .padding(8.dp)
    ) {
        Column(
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
                    .heightIn(200.dp,height.dp)
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
                        Chip(content = dog.weight.toString()+" KG")
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