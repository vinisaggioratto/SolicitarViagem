
package com.vinicius.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Pessoa {
    
    List<Gestor> gestor = new ArrayList<Gestor>();
    List<Funcionario> funcionario = new ArrayList<Funcionario>();
    
    private String name;
    private Date admissao;
    private String cargo;
    private String setor;
    
    public Pessoa() {
    }

    public Pessoa(String name, Date admissao, String cargo, String setor) {
        this.name = name;
        this.admissao = admissao;
        this.cargo = cargo;
        this.setor = setor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getAdmissao() {
        return admissao;
    }

    public void setAdmissao(Date admissao) {
        this.admissao = admissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }


      
}
