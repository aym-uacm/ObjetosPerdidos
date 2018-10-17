package mx.edu.uacm.objsperdidos.repository;

import org.springframework.data.repository.CrudRepository;

import mx.edu.uacm.objsperdidos.domain.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

	Usuario findByCorreo(String correo);
}
