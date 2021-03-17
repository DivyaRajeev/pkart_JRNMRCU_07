package com.p.kart.dao;

import java.util.ArrayList;
import java.util.List;
import com.p.kart.model.Product;

public interface IProductDao {
	 void addProduct(Product product);

	 void removeProduct(Product product);

	 void updateProduct(int id, Product product);
	
	 Product viewProduct(int productId);
	

	 List<Product> viewAllProduct();


}
