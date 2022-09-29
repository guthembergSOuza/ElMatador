/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devdesp.model.negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author ALUNO
 */
@Entity
public class Cotacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    private double valor;
    private Matador matador;
    private long data;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Matador getMatador() {
        return matador;
    }

    public void setMatador(Matador matador) {
        this.matador = matador;
    }

    public long getData() {
        return data;
    }

    public void setData(long data) {
        this.data = data;
    }
    
    
    
    
}
