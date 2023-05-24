package com.example.demo;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ConditionalParamsValidator implements ConstraintValidator<ConditionalParams, RequestParams> {

    @Override
    public boolean isValid(RequestParams requestParams, ConstraintValidatorContext context) {
        System.out.println("in here");
        if (requestParams.getC() != null && (requestParams.getA() != null || requestParams.getB() != null)) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("Both 'a' and 'b' should not be provided when 'c' is provided.")
                    .addPropertyNode("a")
                    .addConstraintViolation();
            return false;
        }

        if (requestParams.getB() != null && requestParams.getA() == null) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("'a' must be provided when 'b' is provided.")
                    .addPropertyNode("a")
                    .addConstraintViolation();
            return false;
        }

        if (requestParams.getA() != null && requestParams.getB() == null) {
            context.disableDefaultConstraintViolation();
            context.buildConstraintViolationWithTemplate("'b' must be provided when 'a' is provided.")
                    .addPropertyNode("b")
                    .addConstraintViolation();
            return false;
        }

        return true;
    }
}