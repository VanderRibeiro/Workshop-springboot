package com.simpla.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpla.project.entities.Category;
import com.simpla.project.repositories.CategoryRepository;

/* Classe de serviço responsável por conter a lógica de negócio relacionada à entidade Category.
Essa camada faz a mediação entre os controladores (resources) e o repositório.*/

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){ // repository.findAll() retorna uma lista com todos os registros da tabela Category
		return repository.findAll();
	}
	
	public Category findById(Long id) {// repository.findById() retorna um Optional, que pode conter ou não um Category
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
