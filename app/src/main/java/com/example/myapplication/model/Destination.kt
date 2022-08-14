package com.example.myapplication.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.myapplication.R
import com.example.myapplication.navigation.destinations.CalendarDestination
import com.example.myapplication.navigation.destinations.HomeDestination

data class Destination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconId: Int
)

val DESTINATIONS = listOf(
    Destination(
        route = HomeDestination.route,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        iconId = R.string.home
    ),
    Destination(
        route = CalendarDestination.route,
        selectedIcon = Icons.Filled.DateRange,
        unselectedIcon = Icons.Filled.DateRange,
        iconId = R.string.calendar
    )
)