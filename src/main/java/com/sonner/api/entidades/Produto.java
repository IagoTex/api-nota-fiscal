package com.sonner.api.entidades;

import com.sonner.api.entidades.base.AbstractEntidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Produto extends AbstractEntidade {

    @Column(nullable = false)
    private String codProduto;

    @Column(nullable = false)
    private String descricao;

    @Column(nullable = false)
    private double preco;

    public Produto(String codProduto, String descricao, double preco) {
        this.codProduto = codProduto;
        this.descricao = descricao;
        this.preco = preco;
    }

    public Produto() {
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
