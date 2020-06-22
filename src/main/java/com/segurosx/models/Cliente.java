package com.segurosx.models;

public class Cliente {
    
    private String nombre;
    private Integer numeroSeguroVehicular;

    public Cliente(String nombre)   {

        this.nombre = nombre;
    }

    public void setCompraSeguroVehicular(SeguroVehicular seguroVehicular) {

        this.numeroSeguroVehicular = seguroVehicular.getNumero();
    }

    public void getListaSeguroCliente()    {

        System.out.println("Nombre: " + this.nombre + " - seguro numero: " + this.numeroSeguroVehicular);
    }
}