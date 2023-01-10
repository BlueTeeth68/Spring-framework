package com.spring.springmvcdemo;

import javax.validation.Valid;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    //add @InitBinder to trim the input strings
    //remove leading and trailing whitespace
    //resolve issue of validation 
    @InitBinder  //it is pre-process function of every String form data
    public void initBinder(WebDataBinder theBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        //Trim the input strings to null
        theBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping("/showForm")
    public String showCustomerForm(Model model) {

        model.addAttribute("customer", new Customer());

        return "customer-form";
    }

    @RequestMapping("/processForm")
    public String processForm(
            @Valid @ModelAttribute("customer") Customer theCustomer,
            BindingResult theResult) {

        /* Note:
        * @Valid tell spring to valid the Customer object
        * Spring store the result of validation in BindingResult object
        * BindingResult must come immediately after the binding object (customer)
        */
        //some trick to know the value of variable that sent from client
        System.out.println("\n\n");
        System.out.println("Last Name: |" + theCustomer.getLastName() + "|");
        System.out.println("The binding result: " + theResult);
        System.out.println("\n\n");

        if (theResult.hasErrors()) {
            return "customer-form";
        } else {
            return "customer-confirmation";
        }
    }
}
