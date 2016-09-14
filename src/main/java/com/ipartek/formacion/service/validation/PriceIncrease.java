package com.ipartek.formacion.service.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class PriceIncrease {

	protected final Log logger = LogFactory.getLog(getClass());

	@Min(0)
	@Max(50)
	private int porcentaje;

	public int getPorcentaje() {
		return this.porcentaje;
	}

	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
		this.logger.info("porcentaje incrementado a " + porcentaje);
	}

}
