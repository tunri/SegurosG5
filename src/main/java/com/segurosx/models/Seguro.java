package com.segurosx.models;

import java.util.Random;

import com.segurosx.models.Dip.ICertificado;
import com.segurosx.models.Dip.IPoliza;
import com.segurosx.models.CalculoPrima;

public abstract class Seguro {

    protected Integer numero;
    protected ICertificado certificado;
    protected IPoliza poliza;
    protected String nivelRiesgo = "NINGUNO";
    protected String bancoTarjeta;
    protected String marca;
    protected String modelo;
    protected Integer anio;
    protected Integer valorComercial;

    public Seguro() {
        this.numero = new Integer(new Random().nextInt());
    }

    public ICertificado getCertificado() {
        return certificado;
    }

    public void setCertificado(ICertificado certificado) {
        this.certificado = certificado;
    }

    public IPoliza getPoliza() {
        return poliza;
    }

    public void setPoliza(IPoliza poliza) {
        this.poliza = poliza;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public abstract String getDetalleSeguro();

    public abstract void cacularRiesgo();

    public abstract void distribucionMensualidadPrima();

    public Double calcularPrima() {
      CalculoPrima calculoPrima = new CalculoPrima();
      ArrayList<Certificado> listaCertificados = new ArrayList();
      listaCertificados.add(this.certificado);
      calculoPrima.CalculoPrima(listaCertificados);
      return calculoPrima.getPrima();
    }
}