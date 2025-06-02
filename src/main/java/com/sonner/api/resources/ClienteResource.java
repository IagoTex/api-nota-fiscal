package com.sonner.api.resources;

import com.sonner.api.entidades.Cliente;
import com.sonner.api.resources.base.AbstractResource;
import com.sonner.api.services.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cliente")
@CrossOrigin(origins = "http://localhost:4200")
public class ClienteResource extends AbstractResource<Cliente, Integer, ClienteService> {

    public ClienteResource(ClienteService service) {
        super(service);
    }

    @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<Cliente> buscarPorNome(@PathVariable String nome) {
        Cliente cliente = service.getByNome(nome);
        return ResponseEntity.ok().body(cliente);
    }
}
