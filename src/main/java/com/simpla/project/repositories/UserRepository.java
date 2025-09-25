package com.simpla.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.simpla.project.entities.User;

public interface UserRepository extends  JpaRepository<User, Long>{
 
}
