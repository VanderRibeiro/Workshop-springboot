package com.simpla.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpla.project.entities.Category;

/*Interface responsável pelo acesso a dados da entidade Category. 
Estende JpaRepository, que fornece uma série de métodos prontos 
para operações CRUD (Create, Read, Update, Delete)*/

public interface CategoryRepository extends JpaRepository<Category, Long>{
 
}
