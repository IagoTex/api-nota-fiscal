package com.sonner.api.services;

import com.sonner.api.entidades.Itens;
import com.sonner.api.entidades.Nota;
import com.sonner.api.repositorios.ItensRepository;
import com.sonner.api.repositorios.NotaRepository;
import com.sonner.api.services.base.AbstractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotaService extends AbstractService<Nota, Integer, NotaRepository> {


    @Autowired
    private ItensService itensService;
    public NotaService(NotaRepository repository) {
        super(repository);
    }

    public double calculaValorTotal(Nota nota) {

        List<Itens> lista = nota.getItens();
        double valorTotal = 0;
        for (Itens item : lista) {
            valorTotal += item.getValorTotal();
        }
        return valorTotal;
    }

    @Override
    public Nota save(Nota entity) {

        Nota notaSalva = repository.save(entity);

        if(notaSalva.getItens() != null) {
            entity.getItens().forEach(itens -> {
                itens.setNota(entity);
                itens.setOrdem(notaSalva.getItens().indexOf(itens) + 1);
                itensService.save(itens);
            });
        }

        notaSalva.setValorTotal(calculaValorTotal(notaSalva));
        repository.save(notaSalva);

        return notaSalva;
    }
}
