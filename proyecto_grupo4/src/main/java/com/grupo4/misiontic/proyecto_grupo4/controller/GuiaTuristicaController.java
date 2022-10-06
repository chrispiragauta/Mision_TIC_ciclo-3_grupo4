package com.grupo4.misiontic.proyecto_grupo4.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GuiaTuristicaController {
    
    @GetMapping("/login")
    public String goToLogin(Model model){
        return ("login");
    };
    
}
