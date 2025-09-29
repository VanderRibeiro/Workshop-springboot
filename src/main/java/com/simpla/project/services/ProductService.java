package com.simpla.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpla.project.entities.Product;
import com.simpla.project.repositories.ProductRepository;

/* Classe de serviço responsável por conter a lógica de negócio relacionada à entidade Product.
Essa camada faz a mediação entre os controladores (resources) e o repositório.*/

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){ // repository.findAll() retorna uma lista com todos os registros da tabela Product
		return repository.findAll();
	}
	
	public Product findById(Long id) {// repository.findById() retorna um Optional, que pode conter ou não um Product
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
}
