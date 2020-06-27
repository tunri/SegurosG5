package com.segurosx.models.Vehicular.SeguroVehicularImpl;

import com.segurosx.models.SeguroVehicular;
import com.segurosx.models.Vehicular.ISeguroVehicularRiesgo;

public class SeguroVehicularRiesgo extends SeguroVehicular implements ISeguroVehicularRiesgo{

    private Integer nivelRiesgo;

	public SeguroVehicularRiesgo(String marca, String modelo, int nivelRiesgo) {
		super(marca, modelo);
		this.nivelRiesgo = nivelRiesgo;
	}

	@Override
	public Integer obtenerNivelRiesgoAccidente() {
		return this.nivelRiesgo;
	}

}