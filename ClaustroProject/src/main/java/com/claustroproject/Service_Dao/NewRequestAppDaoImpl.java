package com.claustroproject.Service_Dao;

import java.util.List;

import com.claustroproject.Entity.NewRequestApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ApplicationEntity;
import com.claustroproject.Service_Dao.AbstractDao.ApplicationDaoImpl;

public class NewRequestAppDaoImpl extends ApplicationDaoImpl<NewRequestApplicationContent, ApplicationEntity<NewRequestApplicationContent>> implements NewRequestAppDao{

	@Override
	public void store(NewRequestApplicationContent applContents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<NewRequestApplicationContent> retrieveAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(NewRequestApplicationContent applContents) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NewRequestApplicationContent getByAppId(String appId) {
		// TODO Auto-generated method stub
		return null;
	}

}
