package com.javalab.service;

import java.util.List;
import java.util.Optional;

import com.javalab.dao.ProductDao;
import com.javalab.exception.ProductNotFoundException;
import com.javalab.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public List<Product> getAllProduct() {

		return productDao.getAllProduct();
	}

	@Override
	public Product getProductById(int productId) throws ProductNotFoundException {
		Optional<Product> optionalProduct = productDao.getProductById(productId);
		if (optionalProduct.isEmpty()) {
			throw new ProductNotFoundException("Product not Exists with id: " + productId);
		}
		return optionalProduct.get();
	}

	@Override
	public boolean createProduct(Product product) {
		return productDao.createProduct(product);
	}

}
