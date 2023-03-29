package com.javalab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.javalab.exception.ProductNotFoundException;
import com.javalab.model.Product;
import com.javalab.service.ProductService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// ProductService productService=new ProductServiceImpl();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring-configuration.xml");
		ProductService productService = (ProductService) context.getBean("productService");
		// System.out.println(productService);
		Product product=new Product(200,"Mobile",1000);
		
		productService.createProduct(product);
		
		System.out.println("Product List:");
		productService.getAllProduct().forEach(System.out::println);

		System.out.println("Find Product by Id");
		
		try {
			System.out.println(productService.getProductById(101));
			System.out.println(productService.getProductById(111));
		} catch (ProductNotFoundException e) {
			System.err.println(e.getMessage());
		}

	}
}
