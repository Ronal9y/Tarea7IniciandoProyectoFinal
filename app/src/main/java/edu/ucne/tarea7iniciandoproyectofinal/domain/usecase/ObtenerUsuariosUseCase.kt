package edu.ucne.tarea7iniciandoproyectofinal.domain.usecase

import edu.ucne.tarea7iniciandoproyectofinal.data.remote.Resource
import edu.ucne.tarea7iniciandoproyectofinal.data.remote.dto.UsuarioResponse
import edu.ucne.tarea7iniciandoproyectofinal.domain.repository.UsuarioRepository
import javax.inject.Inject

class ObtenerUsuariosUseCase @Inject constructor(
    private val repository: UsuarioRepository
) {
    suspend operator fun invoke(): Resource<List<UsuarioResponse>> {
        return repository.getUsuarios()
    }
}