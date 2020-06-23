package com.segurosx.models;

public class SeguroTarjeta extends Seguro {
  
    private String bancoTarjeta;

    private String nivelRiesgo = "NINGUNO";

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    @Override
    public String getDetalleSeguro() {
        
        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }
}