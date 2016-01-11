package com.kpeet.springapp.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;
import com.kpeet.springapp.service.DemoServiceBasicUsageFixedDelay;
import com.kpeet.springapp.service.LocationManager;
import com.kpeet.springapp.service.PriceIncrease;
import com.kpeet.springapp.util.validation.LocationValidator;


@Controller
public class CronController {
	  /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    

    @Autowired
    private LocationManager locationManager;

    
   
    public void doSomething() {
        // something that should execute on weekdays only
    	 DemoServiceBasicUsageFixedDelay  test = new DemoServiceBasicUsageFixedDelay();

        test.demoServiceMethod();
    }
    
    
    @RequestMapping(value="/cron.htm")
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
           
        Map<String, Object> myModel = new HashMap<String, Object>();
        System.out.println("Haciendo Algo:: Preparando la carga inicial");
        this.doSomething();
        System.out.println("Haciendo Algo:: paso el this.doAlgo");
       
        
        myModel.put("blabla", "mojojojo");

        return new ModelAndView("cron", "model", myModel);
    }



}
