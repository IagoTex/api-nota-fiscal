package com.sonner.api.repositorios;

import com.sonner.api.entidades.User;
import com.sonner.api.repositorios.base.AbstractRepository;

import java.util.Optional;


public interface UserRepository extends AbstractRepository<User, Integer> {

    Optional<User> findByUsername(String username);

    boolean existsByUsername(String username);
}
