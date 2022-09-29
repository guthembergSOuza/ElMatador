/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devdesp.model.negocio;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author ALUNO
 */

@Entity
public class Vitima {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    private String nome;
    private String endereco;
    private String enderecoProf;
    private int idade;
    private String estadoCivil;
    private String genero;
    private String classeSocial;
    @Lob
    private String descricao;
    
    @ManyToOne
    private TipoVitima tipo;
    @OneToOne
    private Lances lances;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEnderecoProf() {
        return enderecoProf;
    }

    public void setEnderecoProf(String enderecoProf) {
        this.enderecoProf = enderecoProf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getClasseSocial() {
        return classeSocial;
    }

    public void setClasseSocial(String classeSocial) {
        this.classeSocial = classeSocial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Lances getLances() {
        return lances;
    }

    public void setLances(Lances lances) {
        this.lances = lances;
    }

    public TipoVitima getTipo() {
        return tipo;
    }

    public void setTipo(TipoVitima tipo) {
        this.tipo = tipo;
    }
    
    
    
}
