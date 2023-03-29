package com.javalab.dao;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.javalab.model.Product;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {	
		Product product=new Product(rs.getInt("product_id"), rs.getString("product_name"), rs.getFloat("product_price"));
		return product;
	}

	

}
