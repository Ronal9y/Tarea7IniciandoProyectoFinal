package edu.ucne.tarea7iniciandoproyectofinal.domain.usecase

import javax.inject.Inject

data class UsuariosUseCase @Inject constructor(
    val validarUsuario: ValidarUsuariouseCase,
    val guardarUsuario: GuardarUsuariouseCase,
    val obtenerUsuario: ObtenerUsuarioUseCase,
    val obtenerUsuarios: ObtenerUsuariosUseCase
)