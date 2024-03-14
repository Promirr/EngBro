package kz.engbro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/nav")
public class NavController {

    @GetMapping
    public String navList() {
        return "navlist";
    }

}
