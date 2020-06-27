package com.segurosx;

import com.segurosx.models.Certificado;
import com.segurosx.models.Cliente;
import com.segurosx.models.Poliza;
import com.segurosx.models.Poliza2;
import com.segurosx.models.SeguroTarjeta;
import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.Dip.ICertificado;
import com.segurosx.models.Dip.IPoliza;

/**
 * HRCS
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Cliente cliente = new Cliente("Juan Perez");
        ICertificado certificado = new Certificado();
        IPoliza poliza = new Poliza();
        IPoliza poliza2 = new Poliza2();
        ICalculoPrimaPeru icalperu = new CalculoPrimaPeru();
        
        SeguroVehicular seguroVehicular = new SeguroVehicular(2015, 15000, "Toyota","Yaris");
        seguroVehicular.cacularRiesgo();
        seguroVehicular.calcularKilometrajeMaximo();
        cliente.setCompraSeguro(seguroVehicular);

        //Dip
        seguroVehicular.setCertificado(certificado);
        seguroVehicular.setPoliza(poliza);
        seguroVehicular.setPoliza(poliza2);
        seguroVehicular.setPoliza(poliza2);
        seguroVehicular.calcularPrima();
        seguroVehicular.distribucionMensualidadPrima(icalperu);
        


        SeguroTarjeta seguroTarjeta = new SeguroTarjeta("BCP");
        seguroTarjeta.cacularRiesgo();
        seguroTarjeta.calcularMontoMaximo();
        cliente.setCompraSeguro(seguroTarjeta);
        cliente.getListaSeguroCliente();

        
        

   }
}
