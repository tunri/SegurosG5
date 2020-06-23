package com.segurosx.models;

public class SeguroVehicular extends Seguro {
  
    private String marca;
    private String modelo;
    private String nivelRiesgo = "NINGUNO";

    public SeguroVehicular(String marca, String modelo)    {

        super();
        this.marca = marca;
        this.modelo = modelo;
    }

    public void cacularRiesgo()   {

        if (this.marca.equals("Toyota") && this.modelo.equals("Yaris")) {
            this.nivelRiesgo = "ALTO";
        }
        else {
            this.nivelRiesgo = "BAJO";
        } 
    }

    public String getNivelRiesgo()  {
        return this.nivelRiesgo;
    }

    public String getDetalleSeguro()    {

        return "Seg. Vehicular Numero: " + this.numero + " con riesgo: " + this.nivelRiesgo;
    }    
}