package com.claustroproject.controller.ExceptionController;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionController {

	@ExceptionHandler(value = Exception.class)
	public String exception (Exception e){
		System.out.print(e);
		return "welcome";
	}
}
