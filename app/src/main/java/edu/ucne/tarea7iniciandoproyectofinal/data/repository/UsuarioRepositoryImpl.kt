package edu.ucne.tarea7iniciandoproyectofinal.data.repository

import edu.ucne.tarea7iniciandoproyectofinal.data.remote.dto.UsuarioResponse
import edu.ucne.tarea7iniciandoproyectofinal.data.remote.Resource
import edu.ucne.tarea7iniciandoproyectofinal.data.remote.RemoteDataSource
import edu.ucne.tarea7iniciandoproyectofinal.domain.repository.UsuarioRepository
import javax.inject.Inject

class UsuarioRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : UsuarioRepository {

    override suspend fun getUsuarios(): Resource<List<UsuarioResponse>> {
        return remoteDataSource.getUsuarios()
    }

    override suspend fun getUsuario(id: Int): Resource<UsuarioResponse> {
        return remoteDataSource.getUsuario(id)
    }

    override suspend fun postUsuario(usuario: UsuarioResponse): Resource<UsuarioResponse> {
        return remoteDataSource.postUsuario(usuario)
    }

    override suspend fun putUsuario(id: Int, usuario: UsuarioResponse): Resource<Unit> {
        return remoteDataSource.putUsuario(id, usuario)
    }
}