package com.TopEducation.monolitica.controllers;

import com.TopEducation.monolitica.entities.DescuentoProcedenciaEntity;
import com.TopEducation.monolitica.services.DescuentoProcedenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class DescuentoProcedenciaController {
    @Autowired
    DescuentoProcedenciaService descuentoProcedenciaService;

    @GetMapping("/listarDescuentoProcedencia")
    public String listar(Model model) {
        ArrayList<DescuentoProcedenciaEntity>descuentoProcedencia=descuentoProcedenciaService.obtenerDescuentoProcedencias();
        model.addAttribute("descuentoProcedencia",descuentoProcedencia);
        return "index";
    }

}