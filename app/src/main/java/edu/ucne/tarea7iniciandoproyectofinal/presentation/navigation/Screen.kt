package edu.ucne.tarea7iniciandoproyectofinal.presentation.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class Screen(val route: String) {
    data object Login : Screen("login")
    data object Verificacion : Screen("verificacion")
}