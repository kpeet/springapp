package com.kpeet.springapp.dao;

import java.util.List;

import com.kpeet.springapp.domain.Location;

public class LocationDaoImpl implements LocationDAO{

	@Override
	public List<Location> getLocationList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveProduct(Location loc) {
		// TODO Auto-generated method stub
		
	}
	
	
	/*
	 * 
	 * 
	 @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Product> getProductList() {
        return em.createQuery("select p from Product p order by p.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveProduct(Product prod) {
        em.merge(prod);
    }

	 * 
	 * 
	 * 
	 * */

}
