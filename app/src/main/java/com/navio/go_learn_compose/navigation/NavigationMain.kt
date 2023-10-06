package com.navio.go_learn_compose.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.navio.go_learn_compose.screens.MainScreen

@Composable
fun NavigationMain(){
    //Propagate this var for each screen in order to know the status of the controller
    val navController = rememberNavController()
    //Contains all possible navigation routes
    NavHost(navController = navController, startDestination = Screens.Main.route){
        composable(route = Screens.Main.route){
           MainScreen(navController)
        }
    }
}