package com.sonner.api.repositorios;

import com.sonner.api.entidades.Cliente;
import com.sonner.api.repositorios.base.AbstractRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClienteRepository extends AbstractRepository<Cliente, Integer> {

    Optional<Cliente> findByNomeClienteLike(String nomeCliente);

}
