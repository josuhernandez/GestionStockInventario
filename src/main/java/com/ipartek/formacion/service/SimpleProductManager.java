package com.ipartek.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ipartek.formacion.domain.Product;
import com.ipartek.formacion.repository.ProductDao;

@Component
public class SimpleProductManager implements ProductManager {

	private static final long serialVersionUID = 1L;

	private List<Product> products;

	@Autowired
	private ProductDao productDao;

	@Override
	public void increasePrice(int percentage) throws IllegalArgumentException {
		// throw new UnsupportedOperationException();

		if (percentage < INCREASE_MIN || percentage > INCREASE_MAX) {
			throw new IllegalArgumentException(MSG_ILLEGALARGUMENT_EXCEPTION);
		} else {
			if (this.products != null) {
				for (final Product product : this.products) {
					if (product != null) {
						final double newPrice = product.getPrice().doubleValue() * (100 + percentage) / 100;
						product.setPrice(newPrice);
					}

				}
			}
		}
	}

	@Override
	public List<Product> getProduct() {
		return this.productDao.getProductList();
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

}
