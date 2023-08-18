package com.gruoptwo.proyectofinal.presentation.navigation

sealed class AppScreen(val route : String) {

    object LoginScreen : AppScreen("login_screen")
    object RegisterScreen : AppScreen("register_screen")

    object ProfileScreen : AppScreen("profile_screen")
    object HomeScreen : AppScreen("home_screen")

}