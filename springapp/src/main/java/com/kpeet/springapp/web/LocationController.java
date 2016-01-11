package com.kpeet.springapp.web;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.kpeet.springapp.service.LocationManager;
import com.kpeet.springapp.service.PriceIncrease;
import com.kpeet.springapp.service.ProductManager;
import com.kpeet.springapp.util.validation.LocationValidator;

@Controller
@RequestMapping(value="/priceincrease.htm")
public class LocationController {

    /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    @Autowired
    private LocationManager locationManager;

    @RequestMapping(method = RequestMethod.POST)
    public String onSubmit(@Valid LocationValidator locationValidator, BindingResult result)
    {
        if (result.hasErrors()) {
            return "priceincrease";
        }
		/*
        double lat = locationValidator.getPercentage();
        double lon = 
        logger.info("Increasing prices by " + increase + "%.");
    

        locationManager.getValidateLocation(, lon);    */

        return "redirect:/hello.htm";
    }

    @RequestMapping(method = RequestMethod.GET)
    protected PriceIncrease formBackingObject(HttpServletRequest request) throws ServletException {
        PriceIncrease priceIncrease = new PriceIncrease();
        priceIncrease.setPercentage(15);
        return priceIncrease;
    }

    public void setLocationManager(LocationManager locationManager) {
        this.locationManager = locationManager;
    }

    public LocationManager getProductManager() {
        return locationManager;
    }


}
