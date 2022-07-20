package com.example.myapplication

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.myapplication.ui.theme.MyApplicationTheme

@Composable
fun MyDose(){
    MyApplicationTheme {
        
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            val navController = rememberNavController()
            val doseTopLevelNavigation = rememberNavController(){

            }
            val navBackStack by navController.currentBackStackEntryAsState()
            val currentDestination = navBackStack?.destination
            
            val fabVisibility = rememberSaveable {
                (mutableStateOf(true))
            }
            val bottomNavVisibility = rememberSaveable {
                (mutableStateOf(true))
            }
            
            Scaffold() {
                
            }
        }
    }
}