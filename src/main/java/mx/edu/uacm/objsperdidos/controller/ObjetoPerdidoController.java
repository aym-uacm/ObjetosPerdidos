package mx.edu.uacm.objsperdidos.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mx.edu.uacm.objsperdidos.domain.ObjetoPerdido;
import mx.edu.uacm.objsperdidos.service.ObjetoPerdidoService;

@Controller
@RequestMapping("/primerservlet")
public class ObjetoPerdidoController {
	
	//inyeccion de depencias
	@Autowired
	ObjetoPerdidoService objetoPerdidoService;
	
	@RequestMapping(value="/guardarObjeto", method=RequestMethod.POST)
	public String guardarObjetoPerdido(Map <String, Object> model, ObjetoPerdido objetoPerdido) {
		
		//Servlet
		objetoPerdidoService.guardarObjetoPerdido(objetoPerdido);
		
		return "redirect:/";
	}

}
