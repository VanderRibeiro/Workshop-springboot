package com.simpla.project.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.simpla.project.entities.Order;
import com.simpla.project.services.OrderService;

/*Controlador REST responsável por expor os endpoints relacionados à entidade Order.
Essa classe faz a ponte entre as requisições HTTP e a camada de serviço.*/

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {

    /* Injeta automaticamente uma instância de OrderService.
	Spring cuida da criação e gerenciamento do objeto.*/
	@Autowired
	private OrderService service;

	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
