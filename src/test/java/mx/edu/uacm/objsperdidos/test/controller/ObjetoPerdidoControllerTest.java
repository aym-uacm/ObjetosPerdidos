package mx.edu.uacm.objsperdidos.test.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;

import mx.edu.uacm.objsperdidos.ObjetosPerdidosApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ObjetosPerdidosApplication.class)
@AutoConfigureMockMvc
public class ObjetoPerdidoControllerTest {

	
	private final static Logger log = 
			LogManager.getLogger(ObjetoPerdidoControllerTest.class);
	
	//inyeccion de depedencias
	@Autowired
	private MockMvc mvc;
	
	@Test
	public void testGuardarObjetoPerdido() throws Exception {
		
		log.debug("Entrando al metodo testGuardarObjetoPerdido");
		mvc.perform(post("/primerservlet/guardarObjeto")
				//.param("id", "10")
				.param("nombre", "usb")
				.param("descripcion", "usb toshiba"))
		.andExpect(redirectedUrl("/")) ;
	}
}
