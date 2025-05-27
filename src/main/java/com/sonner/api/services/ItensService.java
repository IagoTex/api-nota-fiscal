package com.sonner.api.services;

import com.sonner.api.entidades.Itens;
import com.sonner.api.entidades.Produto;
import com.sonner.api.repositorios.ItensRepository;
import com.sonner.api.services.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItensService extends AbstractService<Itens, Integer, ItensRepository> {

    @Autowired
    ProdutoService produtoService;

    public ItensService(ItensRepository repository) {
        super(repository);
    }


    public double calculaValorTotal(Itens itens) {

        Produto produto = produtoService.findById(itens.getProduto().getId()).get();
        return produto.getPreco() * itens.getQuantidade();
    }

    @Override
    public Itens save(Itens entity) {

        Itens itens = repository.save(entity);
        itens.setValorTotal(calculaValorTotal(itens));
        return repository.save(itens);
    }

}
