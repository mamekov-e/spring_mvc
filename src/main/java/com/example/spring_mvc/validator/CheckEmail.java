package com.example.spring_mvc.validator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {

    String value() default "xyz.com";

    String message() default "Email must end with xyz.com";

    // grouping annotations - allow to divide by groups annotations
    Class<?>[] groups() default {};

    // payload - allow to transfer data about client's metadata
    Class<? extends Payload>[] payload() default {};

}
