package com.p.kart.service;

import java.util.ArrayList;
import java.util.List;

import com.p.kart.model.Product;

public interface IProductService {
	 boolean addProduct(Product product);

	 boolean removeProduct(Product product);

	 void updateProduct(int id1, Product product);
	
	 Product viewProduct(int productId);
	 
	 

	public List<Product> viewAllProduct();

}
