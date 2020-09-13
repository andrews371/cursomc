package com.andre_empresa.cursomc.resources;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andre_empresa.cursomc.domain.Categoria;
import com.andre_empresa.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	// Em C:\Projetos\Projeto1Java ou no github repositório "primeira api rest"
	// tem uma API Rest simples para consulta
	// contendo pequenas modificações, talvez melhorias.
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
				
		return ResponseEntity.ok().body(obj);
	}

}
