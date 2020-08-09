package com.claustroproject.Entity.AbstractEntity;

import java.util.Map;

import com.claustroproject.Entity.ApplicationContent;
import com.claustroproject.Entity.AbstractEntity.ContainerEntity.Builder;

public class ContainerEntity<Content extends ApplicationContent> {
	
	public ContainerEntity(Builder<Content> builder) {
		this.contents = builder.contents;
		this.validationMap = builder.validationMap;
		this.isSaved = builder.isSaved;
	}
	
	ApplicationEntity<Content> contents;
	
	Map<String, String> validationMap;
	
	boolean isSaved;
	
	public static class Builder<BuilderContent extends ApplicationContent> {
		ApplicationEntity<BuilderContent> contents;
		
		Map<String, String> validationMap;
		
		boolean isSaved;
		
		public Builder() {
	    }
		
		public static <BuilderContent1 extends ApplicationContent> Builder<BuilderContent1> start() { 
			return new Builder<BuilderContent1>(); 
			}
		
		public Builder<BuilderContent> contents(ApplicationEntity<BuilderContent> contents){
			this.contents = contents;
			return this;
		}
		
		public Builder<BuilderContent> isSave(boolean isSaved){
			this.isSaved = isSaved;
			return this;
		}
		
		public Builder<BuilderContent> validationMap(Map<String, String> validationMap){
			this.validationMap = validationMap;
			return this;
		}
		
		public ContainerEntity<BuilderContent> build(){
			return new ContainerEntity<BuilderContent>(this);
		}

	}
}
