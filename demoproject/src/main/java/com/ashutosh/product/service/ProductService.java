package com.ashutosh.product.service;

import java.util.List;

import com.ashutosh.product.model.Product;

public interface ProductService {
	
	List<Product> getAllProduct();
	
	Product getProductById(int productId);
	
	boolean createProduct(Product product);
	
}
