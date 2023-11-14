package com.example.laby12

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun naw() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "A")
    {
        composable(route = "A") {
            screen1(navController)
        }
    }


}