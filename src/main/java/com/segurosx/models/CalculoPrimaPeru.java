package com.segurosx.models;

import com.segurosx.models.ICalculoPrima;

public class CalculoPrimaPeru implements ICalculoPrima{
  private ArrayList<Certificado> certificados;

  public CalculoPrima(ArrayList<Certificado> certificados){
    this.certificados = certificados;
  }

  @Override
  public Double getPrima() {
    int calculoCertificado = 0;
    Calendar cal = Calendar.getInstance();
    int anioActual = cal.get(Calendar.YEAR);
    int diffAnios = (anioActual - this.anio);
    for (Certificado certificado : certificados )  {
      int lastDigit = certificado.getNumero() % 10;
      calculoCertificado += this.valorComercial/(diffAnios*lastDigit);
    }
    return calculoCertificado;
  }
}