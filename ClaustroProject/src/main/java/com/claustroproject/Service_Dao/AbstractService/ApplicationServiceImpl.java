package com.claustroproject.Service_Dao.AbstractService;

import java.util.Map;
import java.util.Objects;

import com.claustroproject.Entity.ApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;
import com.claustroproject.Entity.AbstractEntity.ContainerEntity;
import com.claustroproject.Service_Dao.AbstractDao.ApplicationDao;
import com.claustroproject.Validator.AbstractValidator.BusinessValidator;

public abstract class ApplicationServiceImpl<Contents extends ApplicationContent, Entity extends ApplicationEntity<Contents>, StoreDao extends ApplicationDao<Contents,Entity>> implements ApplicationService<Contents,Entity>{

	StoreDao applicatStoreDao; 
	
	@Override
	public ContainerEntity<Contents> validateAndStore(BusinessValidator<Contents> validator, Entity applicationEntity){
		Map<String,String> violationMap = validator.validate(applicationEntity.getApplicationContent());
		if(Objects.nonNull(violationMap)){
			applicatStoreDao.store(applicationEntity.getApplicationContent());
			applicatStoreDao.storeApplicationDetails(applicationEntity);
		} else {
			return ContainerEntity.Builder.<Contents>start().contents(applicationEntity).isSave(false).validationMap(violationMap).build();
		}
		return ContainerEntity.Builder.<Contents>start().contents(applicationEntity).isSave(true).validationMap(null).build();
	}
}
