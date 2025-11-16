package edu.ucne.tarea7iniciandoproyectofinal.domain.usecase

import edu.ucne.tarea7iniciandoproyectofinal.data.remote.Resource
import edu.ucne.tarea7iniciandoproyectofinal.data.remote.dto.UsuarioResponse
import edu.ucne.tarea7iniciandoproyectofinal.domain.repository.UsuarioRepository
import javax.inject.Inject

class ObtenerUsuarioUseCase @Inject constructor(
    private val repository: UsuarioRepository
) {
    suspend operator fun invoke(id: Int): Resource<UsuarioResponse> {
        return repository.getUsuario(id)
    }
}