package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.config.ApplicationConfigContext;
import com.niit.shoppingcart.dao.ProductDAO;
import com.niit.shoppingcart.model.Product;

public class TestCaseProduct {
	static ProductDAO productDAO;

	static Product product;

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		product = (Product) context.getBean("product");
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
@Test
	public void ProductTestName() {
	product = productDAO.get("CG120");

	String name = product.getName();

	assertEquals("Product Name Test ", "CGname120", name);
	}

	public void close() {
		context.close();
		product = null;

	}

}
