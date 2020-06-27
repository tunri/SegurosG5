package com.segurosx.models;

import com.segurosx.models.Dip.IPoliza;

public class Poliza implements IPoliza{

    private Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}