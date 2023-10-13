package com.TopEducation.monolitica.controllers;

import com.TopEducation.monolitica.entities.AlumnoEntity;
import com.TopEducation.monolitica.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/listar")
    public String listar(Model model) {
        ArrayList<AlumnoEntity>alumnos=alumnoService.obtenerAlumnos();
        model.addAttribute("alumnos",alumnos);
        return "index";
    }

}