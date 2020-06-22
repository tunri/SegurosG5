package com.segurosx.models;

import java.util.Random;

public class Seguro {

    private Integer number;
    
    private Certificado certificado;

    private Poliza poliza;

    public Seguro() {
        this.number = new Integer(new Random().nextInt());
    }

    public Certificado getCertificado() {
        return certificado;
    }

    public void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    public Poliza getPoliza() {
        return poliza;
    }

    public void setPoliza(Poliza poliza) {
        this.poliza = poliza;
    }

    public String getDetalleSeguro()    {

        return "Seguro: " + this.number; 
               //"Poliza: " + this.getPoliza().getNumber() + " - " +
               //"Certificado: " + this.getCertificado().getNumber();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}