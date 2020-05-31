package com.setu.biller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.setu.biller.domain.User;

@Repository 
public interface UserRepository extends CrudRepository<User, String>{

	User findByUsername(String username);
}
