package mx.edu.uacm.objsperdidos.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.edu.uacm.objsperdidos.domain.Usuario;
import mx.edu.uacm.objsperdidos.service.UsuarioService;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	private static Logger log = 
			LogManager.getLogger(UsuarioController.class);
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private HttpSession httpSession;
	
	//@RequestMapping(value="/login", method=RequestMethod.POST)
	@PostMapping("/login")
	public String login(Map <String, Object> model, Usuario usuario) {
		
		
		Usuario usuarioObtenido = usuarioService.obtenerUsuarioPorCorreoYContrasenia(
				usuario.getCorreo(), usuario.getContrasena());
		
		if(usuarioObtenido != null) {
			httpSession.setAttribute("userLoggedIn",usuarioObtenido);
		}
		
		return "login";
	}
}
