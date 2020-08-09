package com.claustroproject.Validator;

import java.util.Map;

import org.springframework.stereotype.Component;

import com.claustroproject.Entity.NewRequestApplicationContent;
import com.claustroproject.Validator.AbstractValidator.BusinessValidator;

@Component
@NewRequestValidation
public class NewRequestValidationImpl implements BusinessValidator<NewRequestApplicationContent>{

	@Override
	public Map<String, String> validate(NewRequestApplicationContent contents) {
		// TODO Auto-generated method stub
		return null;
	}

}
