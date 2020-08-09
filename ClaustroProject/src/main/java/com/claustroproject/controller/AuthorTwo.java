package com.claustroproject.controller;

import org.springframework.stereotype.Component;

@Component
@CustomQualifierTwo
public class AuthorTwo implements Book{

	@Override
	public String getPreface() {
		// TODO Auto-generated method stub
		return "PrefaceTwo";
	}

	@Override
	public String getIntroduction() {
		// TODO Auto-generated method stub
		return "Introduction";
	}

}
