package com.sonner.api.services;

import com.sonner.api.entidades.Produto;
import com.sonner.api.repositorios.ProdutoRepository;
import com.sonner.api.services.base.AbstractService;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService extends AbstractService<Produto, Integer, ProdutoRepository> {

    public ProdutoService(ProdutoRepository repository) {
        super(repository);
    }
}
