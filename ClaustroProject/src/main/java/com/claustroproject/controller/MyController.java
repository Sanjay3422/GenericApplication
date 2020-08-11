package com.claustroproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//import com.claustroproject.controller.DataStructures.MainClass;
import com.claustroproject.controller.ExceptionController.ProductNotFoundException;

@Controller
@RequestMapping("/mycontroller")
public class MyController {
	
	@Autowired
	@CustomQualifier
	Book bestSellingBook;
	
	@Autowired
	@CustomQualifierTwo
	Book secondBestSelling;
		
	@RequestMapping(method = RequestMethod.GET)
    public String index(ModelMap model){
        model.addAttribute("message", "This is the Spring MVC Annotation Example");
//        MainClass.maintain();
//        if(true)
//        throw new ProductNotFoundException();
        
        return "welcome" + bestSellingBook.getPreface() + secondBestSelling.getPreface();
    }
	
}
