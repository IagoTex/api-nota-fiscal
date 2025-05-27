package com.sonner.api.entidades;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sonner.api.entidades.base.AbstractEntidade;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Nota extends AbstractEntidade {

    @Column(nullable = false)
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date data;


    @ManyToOne(optional = false)
    @JoinColumn(name = "cliente")
    private Cliente cliente;

    @OneToMany(mappedBy = "nota", cascade = CascadeType.ALL, orphanRemoval = true)
    @JsonManagedReference
    private List<Itens> itens;

    private double valorTotal;

    public Nota(Date data, Cliente cliente, List<Itens> itens, double valorTotal) {
        this.data = data;
        this.cliente = cliente;
        this.itens = itens;
        this.valorTotal = valorTotal;
    }

    public Nota() {
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }

}
