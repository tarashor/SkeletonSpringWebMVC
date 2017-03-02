package com.tarashor.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Taras on 3/2/2017.
 */
@Controller
public class HomeController {
    @RequestMapping(value="/", method= RequestMethod.GET)
    public String home(){
        return "home";
    }
}
