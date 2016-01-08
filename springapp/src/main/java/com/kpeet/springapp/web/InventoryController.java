package com.kpeet.springapp.web;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.DistanceMatrix;
import com.google.maps.model.GeocodingResult;
import com.kpeet.springapp.service.LocationManager;

@Controller
public class InventoryController {
	 protected final Log logger = LogFactory.getLog(getClass());

	    @Autowired
	    private LocationManager locationManager;

	    @RequestMapping(value="/hello.htm")
	    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response){
	           


	        Map<String, Object> myModel = new HashMap<String, Object>();
	        myModel.put("location", this.locationManager.getLocations());
	        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyB-ZZHRgGvMLczqzDZnmFBds4Zs27wm1AY");
	        
	        try{
	
		        
		        
		        String origin[]={"Vancouver, BC, Canada", "Seattle, État de Washington, États-Unis"};
		        
		        String destiny[]={"San Francisco, Californie, États-Unis", "Victoria, BC, Canada"};
		        
		        
		        
		        DistanceMatrix results = DistanceMatrixApi.getDistanceMatrix(context, origin, destiny).await();
		        System.out.println("viendo el result: ");
		       
		        System.out.println(results.rows[0]);
		        myModel.put("MatrixDistanceResult", results);
		      //  System.out.println(ToStringBuilder.reflectionToString(results, ToStringStyle.MULTI_LINE_STYLE));
//		        System.out.println(results.);
	        
	        
	        }catch(Exception e){
	        	e.printStackTrace();
	        	System.out.println("ahhhhhhhhhhhh:"+e);
	        }
	        	
	        
	        myModel.put("blabla", "mojojojo");

	        return new ModelAndView("hello", "model", myModel);
	    }


	    public void setLocationManager(LocationManager locationManager) {
	        this.locationManager = locationManager;
	    }

}
