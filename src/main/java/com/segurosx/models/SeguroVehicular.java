package com.segurosx.models;

public class SeguroVehicular extends Seguro implements ISeguroVehicular {

    private String modelo;
    private String marca;
    
    public SeguroVehicular(String marca, String modelo)    {
        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    @Override
    public String getMarca() {
        return marca;
    }



    @Override
    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        }
    }

    @Override
    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }    
}