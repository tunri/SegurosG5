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
        icalperu.CalculoPrima(new ArrayList<Certificado>());
        
        SeguroVehicular seguro = new SeguroVehicular("Toyota","Yaris");
        seguro.cacularRiesgo();
        seguro.calcularKilometrajeMaximo();
        cliente.setCompraSeguro(seguro);

        //Dip
        seguro.setCertificado(certificado);
        seguro.setPoliza(poliza);
        seguro.setPoliza(poliza2);
        seguro.setPoliza(poliza2);
        seguro.calcularPrima(icalperu);
        


        SeguroTarjeta seguro2 = new SeguroTarjeta("BCP");
        seguro2.cacularRiesgo();
        seguro2.calcularMontoMaximo();
        cliente.setCompraSeguro(seguro2);
        cliente.getListaSeguroCliente();

        
        

   }
}
