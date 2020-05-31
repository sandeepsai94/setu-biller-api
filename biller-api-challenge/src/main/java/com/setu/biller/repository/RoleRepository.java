package com.setu.biller.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.setu.biller.domain.Role;

@Repository 
public interface RoleRepository extends CrudRepository<Role, String>{

}
