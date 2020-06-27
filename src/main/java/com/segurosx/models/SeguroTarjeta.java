package com.segurosx.models;

import javax.sound.sampled.SourceDataLine;

public class SeguroTarjeta extends Seguro implements ISeguroTarjeta {
  

    public SeguroTarjeta(String bancoTarjeta)    {

        super();
        this.bancoTarjeta = bancoTarjeta;
    }

    @Override
    public void cacularRiesgo()   {

        if (this.bancoTarjeta.equals("AZTECA")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    @Override
    public String getDetalleSeguro() {
        
        return "Seg. Tarjeta Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }

	@Override
	public void calcularMontoMaximo() {
		System.out.println("calculando prima");
	}
}