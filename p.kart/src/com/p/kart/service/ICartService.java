package com.p.kart.service;

import java.util.ArrayList;

import com.p.kart.model.Cart;
import com.p.kart.model.Product;

public interface ICartService {

	boolean addToCart(Product product);
	ArrayList<Product> viewCart();
}
