package com.gruoptwo.proyectofinal.presentation.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.*
import androidx.navigation.NavHostController

@Composable
fun AppNavigation(navController: NavHostController) {

    NavHost(navController = navController, startDestination = AppScreen.LoginScreen.route) {
        composable(AppScreen.LoginScreen.route) {
           // LoginScreen(navController = navController , modifier = Modifier.fillMaxSize())
        }
        composable(AppScreen.RegisterScreen.route) {
           //RegisterScreen(navController = navController , modifier = Modifier.fillMaxSize())
        }
        composable(AppScreen.ProfileScreen.route) {
            //ProfileScreen(navController = navController , modifier = Modifier.fillMaxSize())
        }

        composable(AppScreen.HomeScreen.route) {
            //HomeScreen(navController = navController , modifier = Modifier.fillMaxSize())
        }
    }
}