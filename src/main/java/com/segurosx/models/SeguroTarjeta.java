package com.segurosx.models;

public class SeguroTarjeta extends Seguro implements ISeguroTarjeta {

    private String bancoTarjeta;

    public SeguroTarjeta(String bancoTarjeta) {

        super();
        this.bancoTarjeta = bancoTarjeta;

    }

    public void setBancoTarjeta(String bancoTarjeta) {
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public String getBancoTarjeta() {
        // TODO Auto-generated method stub
        return bancoTarjeta;
    }

    @Override
    public void cacularRiesgo() {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        } else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro() {

        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
}