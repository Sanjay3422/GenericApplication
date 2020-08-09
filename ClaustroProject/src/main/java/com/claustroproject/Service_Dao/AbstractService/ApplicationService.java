package com.claustroproject.Service_Dao.AbstractService;


import com.claustroproject.Entity.ApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;
import com.claustroproject.Entity.AbstractEntity.ContainerEntity;
import com.claustroproject.Validator.AbstractValidator.BusinessValidator;

public interface ApplicationService<Contents extends ApplicationContent, Entity extends ApplicationEntity<Contents>> {
	
	
	public ContainerEntity<Contents> validateAndStore(BusinessValidator<Contents> validator, Entity applicationEntity);
	

}
