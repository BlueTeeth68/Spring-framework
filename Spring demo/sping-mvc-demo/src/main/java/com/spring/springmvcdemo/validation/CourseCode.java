package com.spring.springmvcdemo.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Constraint(validatedBy = CourseCodeConstraintValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

    // define default course code 
    public String value() default "LUV";
    
    // define default error message
    public String message() default "Must start with LUV";
    
    // define default group
    public Class<?>[] groups() default {};
    // Groups: can group related constraints
    
    // define default payloads
    public Class<? extends Payload>[] payload() default {};
    // payload: provide custome details about validation failure
}
