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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author ALUNO
 */

@Entity
public class Contrato {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int codigo;
    private long dataAssinatura;
    private boolean cumprido;
    private long dataExecucao;
    @Lob
    private byte[] foto;
    private String localExecucao;
    private double valor;
    private boolean pago;
    
    @ManyToOne
    private Matador matador;
    @ManyToOne
    private Contratante contratante;
    @OneToOne
    private Vitima vitima;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public long getDataAssinatura() {
        return dataAssinatura;
    }

    public void setDataAssinatura(long dataAssinatura) {
        this.dataAssinatura = dataAssinatura;
    }

    public boolean isCumprido() {
        return cumprido;
    }

    public void setCumprido(boolean cumprido) {
        this.cumprido = cumprido;
    }

    public long getDataExecucao() {
        return dataExecucao;
    }

    public void setDataExecucao(long dataExecucao) {
        this.dataExecucao = dataExecucao;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public String getLocalExecucao() {
        return localExecucao;
    }

    public void setLocalExecucao(String localExecucao) {
        this.localExecucao = localExecucao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Matador getMatador() {
        return matador;
    }

    public void setMatador(Matador matador) {
        this.matador = matador;
    }

    public Contratante getContratante() {
        return contratante;
    }

    public void setContratante(Contratante contratante) {
        this.contratante = contratante;
    }

    public Vitima getVitima() {
        return vitima;
    }

    public void setVitima(Vitima vitima) {
        this.vitima = vitima;
    }
 
    
}
