package com.example.androiddevchallenge.ui.page

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.androiddevchallenge.model.DogModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.DogData
import com.example.androiddevchallenge.ui.theme.teal200
import com.example.androiddevchallenge.ui.theme.typography
import kotlinx.coroutines.launch

/**
 *
 * @author zhangli
 * @email zhanglihow@gmail.com
 * @time
 */
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