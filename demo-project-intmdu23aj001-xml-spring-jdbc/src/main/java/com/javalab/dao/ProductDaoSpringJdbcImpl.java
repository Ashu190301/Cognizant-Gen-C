package com.javalab.dao;

import java.util.List;
import java.util.Optional;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.javalab.model.Product;

public class ProductDaoSpringJdbcImpl implements ProductDao {

	private final static String SQL_CREATE_PRODUCT = "insert into product(productId,productName,productPrice) values(101,'"+"Ashu"+"',300.0)(102,'"+"Sibu"+"',400.0)";
	private final static String SQL_FIND_ALL_PRODUCT = "select * from product";
	private final static String SQL_FIND_PRODUCT_BY_ID = "select * from product where product_id=101";

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Product> getAllProduct() {
		return jdbcTemplate.query(SQL_FIND_ALL_PRODUCT, new ProductMapper());
	}

	@Override
	public Optional<Product> getProductById(int productId) {
		// Product product=jdbcTemplate.queryForObject(SQL_FIND_PRODUCT_BY_ID, new
		// ProductMapper(),productId);
		return Optional.of(jdbcTemplate.queryForObject(SQL_FIND_PRODUCT_BY_ID, new ProductMapper(), productId));
	}

	@Override
	public boolean createProduct(Product product) {
		return jdbcTemplate.update(SQL_CREATE_PRODUCT, product.getProductId(), product.getProducName(),
				product.getProductPrice()) > 0;

	}

}
