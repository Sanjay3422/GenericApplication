package com.claustroproject.controller;

import org.springframework.stereotype.Component;

@Component
public class SuperAuthor extends AuthorOne{
	
	@Override
	public String getPreface() {
		// TODO Auto-generated method stub
		return "SuperAuthor";
	}

}
