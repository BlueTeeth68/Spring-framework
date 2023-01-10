package com.spring.springmvcdemo;

import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {

    //need a controller to show initial form
    @RequestMapping("/showForm")
    public String showForm() {
        return "helloworld-form";
    }

    //need a controller to process the form
//    @RequestMapping("/processForm")
//    public String processForm() {
//        return "helloworld";
//    }
    //a new controller to read the form data and add data to model
//    @RequestMapping("/processForm")
//    public String getCosmicMessage(HttpServletRequest request, Model model) {
//
//        //read the request data
//        String name = request.getParameter("studentName");
//
//        //convert data to all CAPS
//        name = name.toUpperCase();
//
//        //create message
//        String message = "My name is " + name;
//
//        //add message to Model
//        model.addAttribute("message", message);
//
//        return "helloworld";
//    }
    //instead of using request.getParameter(), Spring support us to do this with @RequestParam()
    @RequestMapping("/processForm")
    public String getCosmicMessage(@RequestParam("studentName") String name, Model model) {

        //convert data to all CAPS
        name = name.toUpperCase();

        //create message
        String message = "My name is " + name;

        //add message to Model
        model.addAttribute("message", message);

        return "helloworld";
    }

}
