package com.simpla.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpla.project.entities.OrderItem;
import com.simpla.project.entities.pk.OrderItemPK;

/*Interface responsável pelo acesso a dados da entidade User. 
Estende JpaRepository, que fornece uma série de métodos prontos 
para operações CRUD (Create, Read, Update, Delete)*/

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}