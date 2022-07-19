package com.example.myapplication.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.myapplication.model.Destination

class MyDoseNavigation(private val navController: NavHostController) {

    fun navigateTo(destination: Destination){
        navController.navigate(destination.route){
            popUpTo(navController.graph.findStartDestination().id){
                saveState = true
            }

            launchSingleTop = true
            restoreState = true
        }
    }
}