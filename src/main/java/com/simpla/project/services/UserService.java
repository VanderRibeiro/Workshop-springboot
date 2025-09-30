package com.simpla.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpla.project.entities.User;
import com.simpla.project.repositories.UserRepository;
import com.simpla.project.services.exceptions.ResourceNotFoundException;

/* Classe de serviço responsável por conter a lógica de negócio relacionada à entidade User.
Essa camada faz a mediação entre os controladores (resources) e o repositório.*/

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){ // repository.findAll() retorna uma lista com todos os registros da tabela User
		return repository.findAll();
	}
	
	public User findById(Long id) {// repository.findById() retorna um Optional, que pode conter ou não um User
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}
	
	public User insert(User obj) {
		return repository.save(obj);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity, obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}
}
