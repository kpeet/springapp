package com.kpeet.springapp.dao;

import java.util.List;

import com.kpeet.springapp.domain.Product;

public interface ProductDao {
	
	public List<Product> getProductList();

    public void saveProduct(Product prod);

}
