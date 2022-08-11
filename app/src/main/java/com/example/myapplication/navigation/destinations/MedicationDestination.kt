package com.example.myapplication.navigation.destinations

import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.MutableState
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.myapplication.features.AddMedication
import com.example.myapplication.model.Medication

object AddMedicationDestination : NavigationDestination {
    override val route = "add_medication_route"
    override val destination = "add_medication_destination"
}

fun NavGraphBuilder.addMedicationGraph(bottomBarVisibility: MutableState<Boolean>, fabVisibility: MutableState<Boolean>, onBackClicked: () -> Unit, navigateToMedicationConfirm: (Medication) -> Unit) {
    composable(route = AddMedicationDestination.route) {
        LaunchedEffect(null) {
            bottomBarVisibility.value = false
            fabVisibility.value = false
        }
        AddMedication(onBackClicked, navigateToMedicationConfirm)
    }
}