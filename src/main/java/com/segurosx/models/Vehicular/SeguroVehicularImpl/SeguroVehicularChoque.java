package com.segurosx.models.Vehicular.SeguroVehicularImpl;

import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.Vehicular.ISeguroVehicularChoque;

public class SeguroVehicularChoque extends SeguroVehicular implements ISeguroVehicularChoque {

    private int daño;
	public SeguroVehicularChoque(String marca, String modelo, int daño) {
		super(marca, modelo);
		this.daño = daño;
	}

	@Override
	public Integer getMontoDaño() {
		return daño;
	}
    
}