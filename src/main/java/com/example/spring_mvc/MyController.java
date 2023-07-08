package com.example.spring_mvc;

import com.example.spring_mvc.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.Servlet;
import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import java.util.Set;

@Controller
@RequestMapping("/employee")
public class MyController {

    @RequestMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @RequestMapping("/ask-user-details")
    public String askUserDetails(Model model) {
        model.addAttribute("employee", new Employee());

        return "ask-user-details";
    }

    @RequestMapping("/show-user-details")
    public String showUserDetails(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
//        Validator validator = Validation.buildDefaultValidatorFactory().getValidator();
//        Set<ConstraintViolation<Employee>> violations = validator.validate(employee);
//
//        for(ConstraintViolation<Employee> violation: violations) {
//            System.out.println(violation);
//        }
        if(bindingResult.hasErrors()) {
            return "ask-user-details";
        }
        return "show-user-details";
    }
}
