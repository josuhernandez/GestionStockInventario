package com.ipartek.formacion.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ipartek.formacion.service.ProductManager;
import com.ipartek.formacion.service.validation.PriceIncrease;

@Controller
@RequestMapping(value = "/incremento-precio.html")
public class PriceIncreaseFormController {

	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private ProductManager productManager;

	public void setProductManager(ProductManager productManager) {
		this.productManager = productManager;
	}

	public ProductManager getProductManager() {
		return this.productManager;
	}

	@RequestMapping(method = RequestMethod.POST)
	public String onSubmit(@Valid PriceIncrease priceIncrease, BindingResult result) {
		// Si hay errores volver pagina priceincrease.jsp
		if (result.hasErrors()) {
			return "incremento-precio";
		}

		final int increase = priceIncrease.getPorcentaje();
		this.logger.info("Incrementando todos los precios " + increase + "%.");

		this.productManager.increasePrice(increase);

		return "redirect:/inventario";
	}

	@RequestMapping(method = RequestMethod.GET)
	protected PriceIncrease formBackingObject(HttpServletRequest request) throws ServletException {
		this.logger.debug("Rellando formulario antes de mostrar");
		final PriceIncrease priceIncrease = new PriceIncrease();
		priceIncrease.setPorcentaje(15);
		return priceIncrease;
	}

}
