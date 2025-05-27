package com.sonner.api.entidades;

import com.sonner.api.entidades.base.AbstractEntidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Cliente extends AbstractEntidade {


    @Column(nullable = false)
    private String codCliente;

    @Column(nullable = false)
    private String nomeCliente;

    public Cliente(String codCliente, String nomeCliente) {
        this.codCliente = codCliente;
        this.nomeCliente = nomeCliente;

    }

    public Cliente() {}

    public String getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
}
