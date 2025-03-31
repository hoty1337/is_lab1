package my.hoty.lab1xx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ClientController {
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home() {
        return "home";
    }

    @RequestMapping(value = {"/", "/hello"}, method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
