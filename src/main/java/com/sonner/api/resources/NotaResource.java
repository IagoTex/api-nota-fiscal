package com.sonner.api.resources;

import com.sonner.api.entidades.Nota;
import com.sonner.api.resources.base.AbstractResource;
import com.sonner.api.services.NotaService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/nota")
public class NotaResource extends AbstractResource<Nota, Integer, NotaService> {

    public NotaResource(NotaService service) {
        super(service);
    }
}
