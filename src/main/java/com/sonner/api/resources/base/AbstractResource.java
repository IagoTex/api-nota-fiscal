package com.sonner.api.resources.base;

import com.sonner.api.entidades.base.AbstractEntidade;
import com.sonner.api.services.base.AbstractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.io.Serializable;
import java.net.URI;
import java.util.List;

public abstract class AbstractResource<T extends AbstractEntidade,ID extends Serializable, S extends AbstractService<T,ID, ? >> {

    protected S service;

    public AbstractResource(S service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<T>> getAll() {
        List<T> list = service.findAll();
        return ResponseEntity.ok(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<T> getById(@PathVariable ID id) {
        T entidade = service.findById(id).get();
        return ResponseEntity.ok().body(entidade);
    }

    @PostMapping
    public ResponseEntity<T> save(@RequestBody T entidade) {
        T ent = service.save(entidade);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(ent.getId()).toUri();
        return ResponseEntity.created(uri).body(ent);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<T> update(@PathVariable ID id  , @RequestBody T entidade) {
        T ent = service.update(id, entidade);
        return ResponseEntity.ok().body(ent);

    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<T> delete(@PathVariable ID id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
