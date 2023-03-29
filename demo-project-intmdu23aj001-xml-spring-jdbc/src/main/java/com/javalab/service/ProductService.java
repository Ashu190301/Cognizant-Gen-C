package com.javalab.service;

import java.util.List;

import com.javalab.model.Product;

public interface ProductService {

	List<Product> getAllProduct();

	Product getProductById(int productId);
	
	boolean createProduct(Product  product);
}
