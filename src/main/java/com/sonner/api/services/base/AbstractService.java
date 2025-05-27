package com.sonner.api.services.base;

import com.sonner.api.entidades.base.AbstractEntidade;
import com.sonner.api.repositorios.base.AbstractRepository;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

public abstract class AbstractService<T extends AbstractEntidade,ID extends Serializable, R extends AbstractRepository<T, ID>> {

    protected final R repository;


    public AbstractService(R repository) {
        this.repository = repository;
    }

    public T save(T entity) { return repository.save(entity); }

    public Optional<T> findById(ID id) { return repository.findById(id); }

    public List<T> findAll() { return repository.findAll(); }

    public void deleteById(ID id) { repository.deleteById(id); }

    public T update(ID id , T entity) {
        entity.setId((Integer) id);
        return repository.save(entity); }


}
