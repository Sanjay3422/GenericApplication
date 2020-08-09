package com.claustroproject.Service_Dao.AbstractDao;

import com.claustroproject.Entity.ApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;

public abstract class ApplicationDaoImpl<Content extends ApplicationContent, Entity extends ApplicationEntity<Content>> implements ApplicationDao<Content,Entity>{
	
	@Override
	public void storeApplicationDetails(Entity applEntity){
		
		// Store application details Todo 
		applEntity.getApplicationId();
		applEntity.getUserId();
	}

}
