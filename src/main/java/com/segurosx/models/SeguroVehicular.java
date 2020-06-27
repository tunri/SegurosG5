package com.segurosx.models;

public class SeguroVehicular extends Seguro implements ISeguroVehicular {

    
  public SeguroVehicular(final Integer anio, final Integer valorComercial, final String marca, final String modelo) {

      super();
      this.marca = marca;
      this.modelo = modelo;
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

	@Override
	public void calcularKilometrajeMaximo() {
		System.out.println("calculando cobertura maxima");
	}

	@Override
  public void distribucionMensualidadPrima() {
    System.out.println("calculando la distribución en 12 meses...");
    double primaMensual = this.calcularPrima();
    System.out.println(String.format("%.2f", primaMensual / 12));
  }
}