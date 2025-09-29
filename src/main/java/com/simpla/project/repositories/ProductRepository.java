package com.simpla.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpla.project.entities.Product;

/*Interface responsável pelo acesso a dados da entidade Product. 
Estende JpaRepository, que fornece uma série de métodos prontos 
para operações CRUD (Create, Read, Update, Delete)*/

public interface ProductRepository extends JpaRepository<Product, Long>{
 
}
