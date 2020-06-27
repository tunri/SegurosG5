package com.segurosx.models;

import com.segurosx.models.Dip.ICertificado;

public class Certificado implements ICertificado {
    
    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

}