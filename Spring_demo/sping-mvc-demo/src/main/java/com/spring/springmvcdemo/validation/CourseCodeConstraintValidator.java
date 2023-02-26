package com.spring.springmvcdemo.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

    private String[] coursePrefix;

    @Override
    // define the value() passed in from our annotation
    public void initialize(CourseCode theCourseCode) {
        coursePrefix = theCourseCode.value();
    }

    @Override
    // Business logic
    public boolean isValid(String theCode, ConstraintValidatorContext theConstrainValidatorContext) {

        // theCode is form value that we input
        boolean result = false;

        if (coursePrefix != null) {

            for (String s : coursePrefix) {
                result = theCode.toLowerCase().startsWith(s.toLowerCase());

                if (result) {
                    break;
                }
            }

        } else {
            result = true;
        }

        return result;
    }

}
