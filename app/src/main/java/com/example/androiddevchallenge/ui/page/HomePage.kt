package com.example.androiddevchallenge.ui.page

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material.Scaffold
import androidx.compose.material.SnackbarDuration
import androidx.compose.material.SnackbarHost
import androidx.compose.material.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import kotlinx.coroutines.launch


/**
 *
 * @author zhangli
 * @email zhanglihow@gmail.com
 * @time
 */
@ExperimentalFoundationApi
@Composable
fun HomePage() {
    val snackbarHostState = SnackbarHostState()
    val coroutineScope = rememberCoroutineScope()

    val navController = rememberNavController()

    Scaffold(
        snackbarHost = {
            SnackbarHost(snackbarHostState)
        }) {

        NavHost(navController = navController, startDestination = "dogList") {
            composable("dogList") {
                DogListPage(navController)
            }

            composable("dogDetail/{index}") {
                it.arguments?.getString("index")?.let { it1 ->
                    DogDetailPage(
                        navController,
                        index = it1
                    ) {
                        coroutineScope.launch {
                            snackbarHostState.showSnackbar(
                                message = "You have adopted ${it.name}",
                                duration = SnackbarDuration.Short
                            )
                        }
                    }
                }
            }
        }
    }
}