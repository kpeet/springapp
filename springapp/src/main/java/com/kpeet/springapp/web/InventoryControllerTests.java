package com.kpeet.springapp.web;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.kpeet.springapp.service.SimpleLocationManager;
import com.kpeet.springapp.service.SimpleProductManager;

public class InventoryControllerTests {

	 @Test
	    public void testHandleRequestView() throws Exception{		
	        InventoryController controller = new InventoryController();
	        controller.setLocationManager(new SimpleLocationManager());
	        ModelAndView modelAndView = controller.handleRequest(null, null);		
	        assertEquals("hello", modelAndView.getViewName());
	        assertNotNull(modelAndView.getModel());
		@SuppressWarnings("unchecked")
	        Map<String, Object> modelMap = (Map<String, Object>) modelAndView.getModel().get("model");
	        String nowValue = (String) modelMap.get("now");
	        assertNotNull(nowValue);
	    }

}
