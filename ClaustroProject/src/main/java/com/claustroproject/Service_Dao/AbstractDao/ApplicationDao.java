package com.claustroproject.Service_Dao.AbstractDao;


import java.util.List;

import com.claustroproject.Entity.ApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;

public interface ApplicationDao<Contents extends ApplicationContent, Entity extends ApplicationEntity<Contents>> {

	void store(Contents applContents);
	
	List<Contents> retrieveAll();
	
	
	default void deleteAll(){
		
	}
	
	void delete(Contents applContents);
	
	Contents getByAppId(String appId);
	
	void storeApplicationDetails(Entity entity);
		
}
