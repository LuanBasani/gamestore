package com.luanbasani.gamestore.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;







@Controller
public class indexController {

    //rostas de navegação do site

    @GetMapping("/")
    public String getIndex() {
        return "index";
    }

    @GetMapping("/")
    public String getHome() {
        return "index";
    }
    
    @GetMapping("/game-add")
    public String getGameAdd() {
        return "/game/add";
    }
    
    
}
