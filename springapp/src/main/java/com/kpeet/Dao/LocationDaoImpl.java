package com.kpeet.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kpeet.springapp.domain.Location;

@Repository(value = "locationDao")
public class LocationDaoImpl implements LocationDao{
	
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
    public List<Location> getProductList() {
        return em.createQuery("select p from Product p order by p.id").getResultList();
    }

    @Transactional(readOnly = false)
    public void saveProduct(Location loc) {
        em.merge(loc);
    }


}
