package com.example.myapplication.navigation.destinations

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.features.MedicationConfirm
import com.example.myapplication.model.Medication

const val MEDICATION = "medication"

object MedicationConfirmDestination : NavigationDestination {
    override val route = "medication_confirm_route"
    override val destination = "medication_confirm_destination"
}

fun NavGraphBuilder.medicationConfirmGraph(navController: NavController, bottomBarVisibility: MutableState<Boolean>, fabVisibility: MutableState<Boolean>, onBackClicked: () -> Unit, navigateToHome: () -> Unit) {

    composable(
        route = MedicationConfirmDestination.route,
    ) {
        LaunchedEffect(null) {
            bottomBarVisibility.value = false
            fabVisibility.value = false
        }
        val medication = navController.previousBackStackEntry?.arguments?.getParcelable<Medication>(MEDICATION)
        MedicationConfirm(medication, onBackClicked, navigateToHome)
    }
}