package com.example.spring_mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String emailEnd;

    @Override
    public void initialize(CheckEmail checkEmail) {
        emailEnd = checkEmail.value();
    }

    @Override
    public boolean isValid(String emailEntered, ConstraintValidatorContext constraintValidatorContext) {
        return emailEntered.endsWith(emailEnd);
    }
}
