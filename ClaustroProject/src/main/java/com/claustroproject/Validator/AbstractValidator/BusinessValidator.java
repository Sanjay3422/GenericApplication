package com.claustroproject.Validator.AbstractValidator;

import java.util.Map;


public interface BusinessValidator<T> {

	Map<String, String> validate(T contents);
}