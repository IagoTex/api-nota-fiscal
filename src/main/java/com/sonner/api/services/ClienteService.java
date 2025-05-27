package com.sonner.api.services;

import com.sonner.api.entidades.Cliente;
import com.sonner.api.repositorios.ClienteRepository;
import com.sonner.api.services.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends AbstractService<Cliente, Integer, ClienteRepository> {

    public ClienteService(ClienteRepository repository) {
        super(repository);
    }

    public Cliente getByNome(String nome) {

        return repository.findByNomeClienteLike(nome+"%").orElse(null);
    }

}
