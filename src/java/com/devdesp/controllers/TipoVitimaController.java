/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devdesp.controllers;

import com.devdesp.model.dao.ManagerDao;
import com.devdesp.model.negocio.TipoVitima;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author ALUNO
 */

@ManagedBean(name = "tvController")
@SessionScoped
public class TipoVitimaController {
    
    private TipoVitima tipoVitima;
    
    @PostConstruct
    public void init(){
        this.tipoVitima = new TipoVitima();
    }
    
    public String inserir(){
        
        ManagerDao.getCurrentInstance().insert(this.tipoVitima);
        
        this.tipoVitima = new TipoVitima();
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("Tipo Vítima cadastrado com sucesso!"));
        
        return "index";
    }
    
    public List<TipoVitima> readAllTipoVitima(){
        
        List<TipoVitima> tipos = ManagerDao.getCurrentInstance()
                .read("select tv from TipoVitima tv", 
                        TipoVitima.class);
        return tipos;
    }

    public TipoVitima getTipoVitima() {
        return tipoVitima;
    }

    public void setTipoVitima(TipoVitima tipoVitima) {
        this.tipoVitima = tipoVitima;
    }
    
}
