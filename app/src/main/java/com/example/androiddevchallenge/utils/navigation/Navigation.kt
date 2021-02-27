package com.example.androiddevchallenge.utils.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.*
import com.example.androiddevchallenge.ui.screens.list.DogsBreedListScreen
import com.example.androiddevchallenge.utils.navigation.Route.*

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = DogsSpreedListRoute.tag){

        composable(route = DogsSpreedListRoute.tag){
            DogsBreedListScreen(
                onBreedClick = {
                    breedId -> navController.navigate("${DogsSpreedDetailsRoute.tag}/$breedId")
                }
            )
        }

        composable(route = DogsSpreedDetailsRoute.tag){

        }
    }
}