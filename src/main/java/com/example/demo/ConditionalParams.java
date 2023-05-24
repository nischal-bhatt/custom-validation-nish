package com.example.demo;

import java.lang.annotation.*;
import javax.validation.Constraint;
import javax.validation.Payload;
@Documented
@Constraint(validatedBy = ConditionalParamsValidator.class)
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ConditionalParams {
    String message() default "Invalid parameters";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}


