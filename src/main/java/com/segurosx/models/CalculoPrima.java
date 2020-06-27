package com.segurosx.models;

import com.segurosx.models.ICalculoPrima;

public class CalculoPrima implements ICalculoPrima{

  private Double prima;

  @Override
  public Double getPrima() {
      Calendar cal = Calendar.getInstance();
      int year = cal.get(Calendar.YEAR);
      return this.valorComercial / (year - this.anios);
  }

  public void setPrima(Double prima) {
      this.prima = prima;
  }
}