package com.simpla.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpla.project.entities.Order;
import com.simpla.project.repositories.OrderRepository;

/* Classe de serviço responsável por conter a lógica de negócio relacionada à entidade User.
Essa camada faz a mediação entre os controladores (resources) e o repositório.*/

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){ // repository.findAll() retorna uma lista com todos os registros da tabela User
		return repository.findAll();
	}
	
	public Order findById(Long id) {// repository.findById() retorna um Optional, que pode conter ou não um User
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
