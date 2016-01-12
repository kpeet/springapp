package com.kpeet.springapp.dao;

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
    public List<Location> getLocationList() {                     
        return em.createQuery("select p from Location p ").getResultList(); //order by p.id       
    }

    @Transactional(readOnly = false)
    public void saveLocation(Location loc) {
        em.merge(loc);
    }

    @Transactional(readOnly = false)
	public void updateLocation(Location loc) {
    	 em.persist(loc);
		
	}


}
