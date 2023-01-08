package com.spring.springmvcdemo;

import javax.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/showForm")
    public String showCustomerForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theResult) {

        /* Note:
        * @Valid tell spring to valid the Customer object
        * Spring store the result of validation in BindingResult object
        * BindingResult must come immediately after the binding object (customer)
         */
        if (theResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
