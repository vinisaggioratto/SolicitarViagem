
package com.vinicius.entities;

import java.util.Date;


public class Viagem {
    
    private String origem;
    private String destino;
    private Date inicial;
    private Date fim;
    private String locomocao;
    Veiculos veiculo;

    public Viagem() {
    }

    public Viagem(String origem, String destino, Date inicial, Date fim, String locomocao, Veiculos veiculo) {
        this.origem = origem;
        this.destino = destino;
        this.inicial = inicial;
        this.fim = fim;
        this.locomocao = locomocao;
        this.veiculo = veiculo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getInicial() {
        return inicial;
    }

    public void setInicial(Date inicial) {
        this.inicial = inicial;
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        this.fim = fim;
    }

    public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }

    public Veiculos getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculos veiculo) {
        this.veiculo = veiculo;
    }
    
    
    
}
