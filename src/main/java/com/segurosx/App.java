package com.segurosx;

import com.segurosx.models.Seguro;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Seguro seguroDeJuanPerez = new Seguro();

        System.out.println(seguroDeJuanPerez.getDetalleSeguro());
    }
}
