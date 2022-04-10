package com.example.clubManagementSystem.repository;

import java.util.Optional;

import com.example.clubManagementSystem.models.ERole;
import com.example.clubManagementSystem.models.Role;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
