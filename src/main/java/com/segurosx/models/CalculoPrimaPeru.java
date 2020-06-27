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
    int anios = cal.get(Calendar.YEAR);
    int diffAnios = (year - this.anios);
    for (Certificado certificado : certificados )  {
      int lastDigit = certificado.getNumero() % 10;
      calculoCertificado += this.valorComercial/(diffAnios*lastDigit);
    }
    return calculoCertificado;
  }
}