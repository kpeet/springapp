package com.kpeet.springapp.web;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.kpeet.springapp.service.LocationManager;
import com.kpeet.springapp.service.ProductManager;

@Controller
public class InventoryController {
	 protected final Log logger = LogFactory.getLog(getClass());

	    @Autowired
	    private LocationManager locationManager;

	    @RequestMapping(value="/hello.htm")
	    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {


	        Map<String, Object> myModel = new HashMap<String, Object>();
	        myModel.put("Location", this.locationManager.getLocations());

	        return new ModelAndView("hello", "model", myModel);
	    }


	    public void setLocationManager(LocationManager locationManager) {
	        this.locationManager = locationManager;
	    }

}
