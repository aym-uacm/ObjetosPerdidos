package mx.edu.uacm.objsperdidos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.objsperdidos.domain.Usuario;
import mx.edu.uacm.objsperdidos.repository.UsuarioRepository;
import mx.edu.uacm.objsperdidos.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioRepository usuarioRepository;
	
	/*
	 * (non-Javadoc)
	 * @see mx.edu.uacm.objsperdidos.service.UsuarioService#obtenerUsuarioPorCorreoYContrasenia(java.lang.String, java.lang.String)
	 */
	public Usuario obtenerUsuarioPorCorreoYContrasenia(String correo, String contrasenia) {
		
		/*
		 * If
		 * while
		 * for each<<<<<<<
		 * case
		 */
		return usuarioRepository.findByCorreoAndContrasena(correo, contrasenia);
	}

}
