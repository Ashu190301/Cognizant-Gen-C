package com.javalab.dao;

import java.util.List;
import java.util.Optional;

import com.javalab.model.Product;

public interface ProductDao {
	
	List<Product> getAllProduct();
	
	Optional<Product> getProductById(int productId);
	
	boolean createProduct(Product  product);

}
