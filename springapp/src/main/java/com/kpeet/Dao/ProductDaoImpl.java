package com.kpeet.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.transaction.annotation.Transactional;

import com.kpeet.springapp.domain.Product;

public class ProductDaoImpl implements ProductDao {

	 private EntityManager em = null;
    /*
     * Sets the entity manager.
     */
    @PersistenceContext
    public void setEntityManager(EntityManager em) {
        this.em = em;
    }

    @Transactional(readOnly = true)
    @SuppressWarnings("unchecked")
    public List<Product> getProductList() {
        return em.createQuery("select * from Location loc order by loc.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveProduct(Product prod) {
        em.merge(prod);
    }


}
