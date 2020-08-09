package com.claustroproject.controller.GenericProject;


import org.springframework.web.bind.annotation.RequestMapping;

import com.claustroproject.Entity.NewRequestApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;
import com.claustroproject.Entity.AbstractEntity.ContainerEntity;
import com.claustroproject.Service_Dao.NewRequestAppService;
import com.claustroproject.Validator.NewRequestValidation;
import com.claustroproject.Validator.AbstractValidator.BusinessValidator;
import com.claustroproject.controller.AbstractController.ClaustriacController;

@RequestMapping("/request")
public class NewRequestController extends ClaustriacController<NewRequestApplicationContent>{
	
	@NewRequestValidation
	BusinessValidator<NewRequestApplicationContent> businessValidator;
	
	NewRequestAppService newRequestAppService;
	
	public ContainerEntity<NewRequestApplicationContent> addRequest(ApplicationEntity<NewRequestApplicationContent> contents){

		
		return newRequestAppService.validateAndStore(businessValidator, contents);
	}
}
