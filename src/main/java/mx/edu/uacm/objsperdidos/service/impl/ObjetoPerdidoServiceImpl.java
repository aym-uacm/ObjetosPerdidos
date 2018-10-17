package mx.edu.uacm.objsperdidos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.edu.uacm.objsperdidos.domain.ObjetoPerdido;
import mx.edu.uacm.objsperdidos.repository.ObjetoPerdidoRepository;
import mx.edu.uacm.objsperdidos.service.ObjetoPerdidoService;

@Service
public class ObjetoPerdidoServiceImpl implements ObjetoPerdidoService {

	//Inyeccion de dependencias
	@Autowired
	ObjetoPerdidoRepository objetoPerdidoRepository;
	
	
	@Override
	public boolean guardarObjetoPerdido(ObjetoPerdido objPerdido) {
		
		boolean bandera = false;

		ObjetoPerdido objetoGuardado = 
				objetoPerdidoRepository.save(objPerdido);

		if(objetoGuardado!=null) 
			bandera = true;
		
		return bandera;
	}

}
