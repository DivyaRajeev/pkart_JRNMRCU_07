package com.p.kart.dao;

import java.util.ArrayList;

import com.p.kart.model.Product;

public interface ICartDao {
	void addToCart(Product product);
	ArrayList<Product> viewCart();

}
