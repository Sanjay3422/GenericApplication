package com.claustroproject.controller;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@CustomQualifier
public class AuthorOne implements Book  {

	@Override
	public String getPreface() {
		// TODO Auto-generated method stub
		return "Preface";
	}

	@Override
	public String getIntroduction() {
		// TODO Auto-generated method stub
		return "Intro";
	}

}
