package edu.ucne.tarea7iniciandoproyectofinal.domain.repository

import edu.ucne.tarea7iniciandoproyectofinal.data.remote.Resource
import edu.ucne.tarea7iniciandoproyectofinal.data.remote.dto.UsuarioResponse

interface UsuarioRepository {

    suspend fun getUsuarios(): Resource<List<UsuarioResponse>>

    suspend fun getUsuario(id: Int): Resource<UsuarioResponse>

    suspend fun postUsuario(usuario: UsuarioResponse): Resource<UsuarioResponse>

    suspend fun putUsuario(id: Int, usuario: UsuarioResponse): Resource<Unit>
}