package mx.edu.uacm.objsperdidos.service;

import mx.edu.uacm.objsperdidos.domain.Usuario;

/**
 * Deficion de los contratos del servicio de usuario
 * @author Sergio Mena
 *
 */
public interface UsuarioService {

	/**
	 * Metodo utilizado para obtener el usuario a traves
	 * de su correo electronico y password
	 * @param correo
	 * @param contrasenia
	 * @return Usuario 
	 */
	Usuario obtenerUsuarioPorCorreoYContrasenia(String correo, 
			String contrasenia);
	
}
