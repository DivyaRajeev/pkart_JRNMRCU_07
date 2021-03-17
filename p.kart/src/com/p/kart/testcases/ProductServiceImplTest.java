package com.p.kart.testcases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.p.kart.model.Customer;
import com.p.kart.model.Product;
import com.p.kart.service.ProductServiceImpl;

class ProductServiceImplTest {
	private ProductServiceImpl productServiceImpl;
	@BeforeEach
	void setUp() throws Exception {
		productServiceImpl=new ProductServiceImpl();
	}

	@AfterEach
	void tearDown() throws Exception {
		productServiceImpl=null;
	}

	@Test
	void testAddProduct() {
		Product product = new Product(1, "med7",280.00d,1, "12-04-2018", "09-04-2023" );
		boolean result = productServiceImpl.addProduct(product);
	    assertEquals(true, result);
	}

}
