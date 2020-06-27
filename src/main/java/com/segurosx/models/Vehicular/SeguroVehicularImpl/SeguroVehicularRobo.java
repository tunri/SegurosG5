package com.segurosx.models.Vehicular.SeguroVehicularImpl;

import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.Vehicular.ISeguroVehicularRobo;

public class SeguroVehicularRobo extends SeguroVehicular implements ISeguroVehicularRobo {

    private String fechaRobo;

	public SeguroVehicularRobo(String marca, String modelo) {
		super(marca, modelo);
    }
    
    @Override
    public void setFechaRobo(String fechaRobo) {
        this.fechaRobo = fechaRobo;
    }

	@Override
	public String obtenerFechaRobo() {
		return this.fechaRobo;
	}
    
}