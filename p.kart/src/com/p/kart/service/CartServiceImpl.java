package com.p.kart.service;

import java.util.ArrayList;

import com.p.kart.dao.CartDaoImpl;
import com.p.kart.dao.ICartDao;
import com.p.kart.model.Product;

public class CartServiceImpl implements ICartService{
	private static ICartDao cartDao;

	public CartServiceImpl() {

		if (null == cartDao)
			cartDao =  new CartDaoImpl();

	}

	@Override
	public  boolean addToCart(Product product) {   //adding product to cart
		cartDao.addToCart(product);
		ArrayList<Product> savedProduct = cartDao.viewCart();

		if (savedProduct != null)
			return true;
		else
			return false;


	}

	@Override
	public ArrayList<Product> viewCart() {
		return cartDao.viewCart();
		
	}

}
