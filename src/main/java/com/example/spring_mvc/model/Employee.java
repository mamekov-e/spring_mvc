package com.example.spring_mvc.model;

import com.example.spring_mvc.validator.CheckEmail;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.validation.constraints.*;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class Employee {
    @Size(min = 2, message = "Name should be minimum 2 symbols size")
    private String name;
    @NotBlank(message = "Surname is required field")
    private String surname;
    @Min(value = 100, message = "Salary should be greater than 99")
    @Max(value = 1000, message = "Salary should be less than 1001")
    private int salary;
    private String department;
    private String carBrand;
    private String[] languages;
    @Pattern(regexp = "\\d{3}-\\d{3}-\\d{2}-\\d{2}", message = "Number should follow the patter xxx-xxx-xx-xx")
    private String phoneNumber;
    @CheckEmail
    private String email;
    private Map<String, String> departments;
    private Map<String, String> brands;
    private Map<String, String> languagesOptions;

    public Employee() {
        departments = new HashMap<>();
        departments.put("IT", "IT");
        departments.put("Sales", "Sales");
        departments.put("HR", "HR");

        brands = new HashMap<>();
        brands.put("BMW","BMW");
        brands.put("Opel","Opel");
        brands.put("Mers","Mers");

        languagesOptions = new HashMap<>();
        languagesOptions.put("KZ","Kazakh");
        languagesOptions.put("RU","Russian");
        languagesOptions.put("EN","English");
    }
}
