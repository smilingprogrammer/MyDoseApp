package com.example.myapplication.model

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.outlined.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.myapplication.R

data class Destination(
    val route: String,
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconId: Int
)

val DESTINATIONS = listOf(
    Destination(
        route = ,
        selectedIcon = Icons.Filled.Home,
        unselectedIcon = Icons.Outlined.Home,
        iconId = R.string.home
    ),
    Destination(
        route = ,
        selectedIcon = Icons.Filled.DateRange,
        unselectedIcon = Icons.Filled.DateRange,
        iconId = R.string.calendar
    )
)