package com.sonner.api.resources;

import com.sonner.api.entidades.Itens;
import com.sonner.api.resources.base.AbstractResource;
import com.sonner.api.services.ItensService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/itens")
public class ItensResource extends AbstractResource<Itens, Integer, ItensService> {

    public ItensResource(ItensService service) {
        super(service);
    }


}
