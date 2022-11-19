
package com.vinicius.entities;


public class Diarias {
    
    private Double valor;
    private String descricao;
    Viagem viagem;

    public Diarias() {
    }

    public Diarias(Double valor, String descricao, Viagem viagem) {
        this.valor = valor;
        this.descricao = descricao;
        this.viagem = viagem;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }
    
    
}
