package com.TopEducation.monolitica.services;

import com.TopEducation.monolitica.entities.AlumnoEntity;
import com.TopEducation.monolitica.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
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

    public void guardarAlumno(String nombres, String apellidos, String RUT, String colegioProcedencia,
                              String nombreColegio, Date anoEgreso, Date fechaNacimiento){
        AlumnoEntity alumno = new AlumnoEntity();
        alumno.setAnoEgreso(anoEgreso);
        alumno.setApellidos(apellidos);
        alumno.setRUT(RUT);
        alumno.setNombres(nombres);
        alumno.setFechaNacimiento(fechaNacimiento);
        alumno.setColegioProcedencia(colegioProcedencia);
        alumno.setNombreColegio(nombreColegio);
        alumnoRepository.save(alumno);
    }
    public Optional<AlumnoEntity> obtenerPorId(String id){
        return alumnoRepository.findById(id);
    }

    public boolean eliminarAlumno(String id) {
        try{
            alumnoRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}