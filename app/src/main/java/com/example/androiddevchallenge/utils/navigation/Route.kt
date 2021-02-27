package com.example.androiddevchallenge.utils.navigation

sealed class Route(val tag:String){
    object SplashRoute : Route(tag = "splash")
    object DogsSpreedListRoute : Route(tag = "dogs spreed list")
    object DogsSpreedDetailsRoute : Route(tag = "dogs spreed details")
}
