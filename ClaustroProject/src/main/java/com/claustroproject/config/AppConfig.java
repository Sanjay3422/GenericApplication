package com.claustroproject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.claustroproject.controller.AuthorOne;
import com.claustroproject.controller.AuthorTwo;
import com.claustroproject.controller.Book;
import com.claustroproject.controller.CustomQualifier;
import com.claustroproject.controller.CustomQualifierTwo;
import com.claustroproject.controller.SuperAuthor;

@Configuration
public class AppConfig {
	
//	@Bean
//	@CustomQualifierTwo
//	public Book authorBookTwo(){
//		return new AuthorTwo();
//	}
//	
//	@Bean
//	@CustomQualifier
//	public Book authorBook(){
//		return new SuperAuthor();
//	}

}
