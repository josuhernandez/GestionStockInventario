package com.ipartek.formacion.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

public class ProductTest {

	private Product product;

	@Before
	public void setUp() throws Exception {
		this.product = new Product();
	}

	@Test
	public void testSetAndGetDescription() {
		assertNull(this.product.getDescription());
		final String testDescription = "aDescription";
		this.product.setDescription(testDescription);
		assertEquals(testDescription, this.product.getDescription());
	}

	@Test
	public void testSetAndGetPrice() {
		final double testPrice = 100.00;
		this.product.setPrice(testPrice);
		assertEquals(testPrice, this.product.getPrice(), 0);
	}

}
