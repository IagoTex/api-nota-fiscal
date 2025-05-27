package com.sonner.api.resources;

import com.sonner.api.entidades.Produto;
import com.sonner.api.resources.base.AbstractResource;
import com.sonner.api.services.ProdutoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/produto")
public class ProdutoResource extends AbstractResource<Produto, Integer, ProdutoService> {

    public ProdutoResource(ProdutoService service) {
        super(service);
    }
}
