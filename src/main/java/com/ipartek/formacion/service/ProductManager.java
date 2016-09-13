package com.ipartek.formacion.service;

import java.io.Serializable;
import java.util.List;

import com.ipartek.formacion.domain.Product;

public interface ProductManager extends Serializable {

	/**
	 * Incrementa el precio de todos los productos
	 *
	 * @param percentage
	 *            {@code int} porcentaje a incrementar maximo 50, minimo 0
	 * @throws IllegalArgumentException
	 */
	public void increasePrice(int percentage) throws IllegalArgumentException;

	public List<Product> getProducts();

}
