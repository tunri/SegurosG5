package com.segurosx.models.Vehicular.SeguroVehicularImpl;

import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.Vehicular.ISeguroVehicularSoat;

public class SeguroVehicularSoat extends SeguroVehicular implements ISeguroVehicularSoat{


    private String indemnizacion;
	public SeguroVehicularSoat(String marca, String modelo, String indemnizacion) {
		super(marca, modelo);
		this.indemnizacion = indemnizacion;
	}

	@Override
	public String obtenerIndeminizacion() {
		return this.indemnizacion;
	}
    
}