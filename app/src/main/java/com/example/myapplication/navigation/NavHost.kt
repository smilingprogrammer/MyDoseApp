package com.example.myapplication.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.navigation.destinations.HomeDestination
import com.example.myapplication.navigation.destinations.MEDICATION
import com.example.myapplication.navigation.destinations.MedicationConfirmDestination
import com.google.gson.Gson

@Composable
fun NavHost(
    bottomBarVisibility: MutableState<Boolean>,
    fabVisibility: MutableState<Boolean>,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = HomeDestination.route
) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        homeGraph(bottomBarVisibility, fabVisibility)
        calendarGraph(bottomBarVisibility, fabVisibility)
        addMedicationGraph(
            bottomBarVisibility = bottomBarVisibility,
            fabVisibility = fabVisibility,
            onBackClicked = { navController.navigateUp() },
            navigateToMedicationConfirm = {
                // TODO: Replace with medication id
                navController.currentBackStackEntry?.arguments?.putParcelable(MEDICATION, it)
                val medicationJson = Uri.encode(Gson().toJson(it))
                navController.navigate(MedicationConfirmDestination.route)
            }
        )
        medicationConfirmGraph(
            navController = navController,
            bottomBarVisibility = bottomBarVisibility,
            fabVisibility = fabVisibility,
            onBackClicked = { navController.navigateUp() },
            navigateToHome = {
                // TODO: Navigate to Home with no backstack.
                navController.navigate(HomeDestination.route)
            }
        )
    }
}