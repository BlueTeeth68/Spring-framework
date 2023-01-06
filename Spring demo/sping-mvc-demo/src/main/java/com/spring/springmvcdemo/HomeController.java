package com.spring.springmvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//Note that @Controller inherit from @Component
public class HomeController {

    @RequestMapping("/home")
    public String showPage() {
        return "index";
    }
}
