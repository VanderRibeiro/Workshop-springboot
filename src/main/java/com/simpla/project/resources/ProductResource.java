package com.simpla.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpla.project.entities.Product;
import com.simpla.project.services.ProductService;

/*Controlador REST responsável por expor os endpoints relacionados à entidade Product.
Essa classe faz a ponte entre as requisições HTTP e a camada de serviço.*/

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    /* Injeta automaticamente uma instância de ProductService.
	Spring cuida da criação e gerenciamento do objeto.*/
	@Autowired
	private ProductService service;

	@GetMapping
	public ResponseEntity<List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
