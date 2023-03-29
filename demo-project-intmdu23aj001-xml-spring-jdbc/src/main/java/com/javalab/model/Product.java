package com.javalab.model;

public class Product {	
	private int productId;
	private String producName;
	private float productPrice;
	
	public Product() {
		
	}

	public Product(int productId, String producName, float productPrice) {
		super();
		this.productId = productId;
		this.producName = producName;
		this.productPrice = productPrice;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProducName() {
		return producName;
	}

	public void setProducName(String producName) {
		this.producName = producName;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", producName=" + producName + ", productPrice=" + productPrice
				+ "]";
	}
	
	
}
