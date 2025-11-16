package edu.ucne.tarea7iniciandoproyectofinal.data.mapper

import edu.ucne.tarea7iniciandoproyectofinal.data.remote.dto.UsuarioResponse
import edu.ucne.tarea7iniciandoproyectofinal.domain.model.Usuario

fun UsuarioResponse.toDomain(): Usuario {
    return Usuario(
        usuarioId = this.usuarioId,
        userName = this.userName,
        password = this.password
    )
}

fun Usuario.toDto(): UsuarioResponse {
    return UsuarioResponse(
        usuarioId = this.usuarioId,
        userName = this.userName,
        password = this.password
    )
}