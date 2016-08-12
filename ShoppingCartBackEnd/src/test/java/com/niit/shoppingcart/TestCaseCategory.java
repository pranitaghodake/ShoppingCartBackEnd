package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.model.Category;

public class TestCaseCategory {
	static CategoryDAO categoryDAO;

	static Category category;

	static AnnotationConfigApplicationContext context;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		category = (Category) context.getBean("category");
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}

	@Test
	public void CategoryNameTest() {

		category = categoryDAO.get("CG120");

		String name = category.getName();

		assertEquals("Category Name Test ", "CGname120", name);

	}

	public void close() {
		context.close();
		category=null;
		
	}

}
