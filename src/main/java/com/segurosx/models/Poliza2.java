package com.segurosx.models;

import com.segurosx.models.Dip.IPoliza;

public class Poliza2 implements IPoliza {

    private Integer numero;

	@Override
	public Integer getNumero() {
	
		return this.numero + 2;
	}

	@Override
	public void setNumero(Integer numero) {
		this.numero = numero;
	}

}