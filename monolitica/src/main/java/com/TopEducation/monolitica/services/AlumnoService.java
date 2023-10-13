package com.TopEducation.monolitica.services;

import com.TopEducation.monolitica.entities.AlumnoEntity;
import com.TopEducation.monolitica.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<AlumnoEntity> obtenerAlumnos(){
        return (ArrayList<AlumnoEntity>) alumnoRepository.findAll();
    }

    public AlumnoEntity guardarAlumno(AlumnoEntity usuario){
        return alumnoRepository.save(usuario);
    }

    public Optional<AlumnoEntity> obtenerPorId(Long id){
        return alumnoRepository.findById(id);
    }

    public boolean eliminarAlumno(Long id) {
        try{
            alumnoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}