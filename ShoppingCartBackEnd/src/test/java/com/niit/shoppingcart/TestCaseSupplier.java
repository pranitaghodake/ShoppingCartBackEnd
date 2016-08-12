package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.config.ApplicationConfigContext;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.SupplierDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.Supplier;

public class TestCaseSupplier {
	static SupplierDAO supplierDAO;

	static Supplier supplier;

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		supplier = (Supplier) context.getBean("supplier");
		supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
	}
@Test
	public void TestCaseSupplier() {
	supplier = supplierDAO.get("CG120");

	String name = supplier.getName();

	assertEquals("Supplier Name Test ", "CGname120", name);
	}
}
