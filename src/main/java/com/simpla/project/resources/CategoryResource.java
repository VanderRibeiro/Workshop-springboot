package com.simpla.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpla.project.entities.Category;
import com.simpla.project.services.CategoryService;

/*Controlador REST responsável por expor os endpoints relacionados à entidade Category.
Essa classe faz a ponte entre as requisições HTTP e a camada de serviço.*/

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {

    /* Injeta automaticamente uma instância de CategoryService.
	Spring cuida da criação e gerenciamento do objeto.*/
	@Autowired
	private CategoryService service;

	@GetMapping
	public ResponseEntity<List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
