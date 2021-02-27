package com.example.androiddevchallenge.utils.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.*
import com.example.androiddevchallenge.ui.screens.details.DetailsScreen
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

        composable(route = "${DogsSpreedDetailsRoute.tag}/{breedId}",
            arguments = listOf(navArgument("breedId") { type = NavType.IntType })){
                navBackStackEntry ->
            navBackStackEntry.arguments?.getInt("breedId")?.let { breedId ->
                DetailsScreen(
                    breedId = breedId,
                    onNavigateBack = { navController.popBackStack() }
                )
            }
        }
    }
}