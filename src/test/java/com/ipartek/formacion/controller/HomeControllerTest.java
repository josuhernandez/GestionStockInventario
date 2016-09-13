package com.ipartek.formacion.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Locale;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

public class HomeControllerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testHome() {
		final HomeController hc = new HomeController();
		final Locale locale = new Locale("es", "es");
		assertEquals("No retorna el String de la Vista 'home.jsp' ", "home", hc.home(locale, null));
	}

	@Test
	public void testInfo() {
		final HomeController hc = new HomeController();
		try {

			final ModelAndView mv = hc.info(null, null);
			assertEquals("home", mv.getViewName());
			// TODO comprobar Modelo
			// mv.getModel().get("")

		} catch (final Exception e) {
			fail("No deberia saltar Exception");
		}

	}

}
