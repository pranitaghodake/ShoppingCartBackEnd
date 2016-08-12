package com.niit.shoppingcart;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingcart.config.ApplicationConfigContext;
import com.niit.shoppingcart.dao.CategoryDAO;
import com.niit.shoppingcart.dao.UserDAO;
import com.niit.shoppingcart.model.Category;
import com.niit.shoppingcart.model.User;

public class TestCaseUser {

	static UserDAO userDAO;
	
	static User user;
	
	static AnnotationConfigApplicationContext context;
	@BeforeClass
	public static void init()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		user =  (User) context.getBean("user");
		userDAO = (UserDAO) context.getBean("userDAO");
	}
	
	
	public void TestCaseUser()
	{
		user =((UserDAO) user).get("CG001");
		
		String name= user.getName();

		assertEquals("User Name Test ", "CGname120", name);
	}
	}



