package com.example.myapplication.navigation

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.features.Calendar

object CalendarDestination : NavigationDestination {
    override val route = "calendar_route"
    override val destination = "calendar_destination"
}

fun NavGraphBuilder.calendarGraph(bottomBarVisibility: MutableState<Boolean>, fabVisibility: MutableState<Boolean>) {
    composable(route = CalendarDestination.route) {
        LaunchedEffect(null) {
            bottomBarVisibility.value = true
            fabVisibility.value = false
        }
        Calendar()
    }
}