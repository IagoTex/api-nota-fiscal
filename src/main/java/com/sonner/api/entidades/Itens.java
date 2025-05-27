package com.sonner.api.entidades;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.sonner.api.entidades.base.AbstractEntidade;

import javax.persistence.*;


@Entity
public class Itens extends AbstractEntidade {


    @ManyToOne(optional = false)
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(nullable = false)
    private Integer quantidade;

    private Integer ordem;

    @ManyToOne
    @JoinColumn(name = "nota_id")
    @JsonBackReference
    private Nota nota;

    private double valorTotal;

    public Itens(Produto produto, Integer quantidade, Integer ordem, Nota nota ,double valorTotal) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.ordem = ordem;
        this.nota = nota;
        this.valorTotal = valorTotal;
    }

    public Itens() {
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Nota getNota() {
        return nota;
    }

    public void setNota(Nota nota) {
        this.nota = nota;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }
}