package com.TopEducation.monolitica.controllers;

import com.TopEducation.monolitica.entities.AlumnoEntity;
import com.TopEducation.monolitica.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
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
    @GetMapping("/nuevo-alumno")
    public String alumno(){
        return "nuevo-alumno";
    }
    @PostMapping("/nuevo-alumno")
    public String nuevoAlumno(@RequestParam("nombres") String nombres,
                              @RequestParam("apellidos") String apellidos,
                              @RequestParam("RUT") String RUT,
                              @RequestParam("colegioProcedencia") String colegioProcedencia,
                              @RequestParam("nombreColegio") String nombreColegio,
                              @RequestParam("anoEgreso") Date anoEgreso,
                              @RequestParam("fechaNacimiento") Date fechaNacimiento){
        alumnoService.guardarAlumno(nombres, apellidos, RUT, colegioProcedencia, nombreColegio, anoEgreso, fechaNacimiento);
        return "redirect:/nuevo-alumno";
    }
}