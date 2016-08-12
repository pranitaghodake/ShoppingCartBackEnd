package com.niit.shoppingcart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.niit.shoppingcart.dao.CartDAO;
import com.niit.shoppingcart.model.Cart;

public class CartTest {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.shoppingcart");
		context.refresh();
		
		Cart cart = (Cart) context.getBean("cart");
		CartDAO cartDAO = (CartDAO) context.getBean("cartDAO");
		
		cart.setCartProductId("C101");
		cart.setCartProductName("laptop");
		cart.setCartProductUser("Smriti");
		cart.setCartProductPrice(50000);
		
		cartDAO.saveOrUpdate(cart);
		//System.out.println(cartDAO.listCartItems());
	}
}
