package com.TopEducation.monolitica.services;

import com.TopEducation.monolitica.entities.DescuentoProcedenciaEntity;
import com.TopEducation.monolitica.repositories.DescuentoProcedenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DescuentoProcedenciaService {
    @Autowired
    DescuentoProcedenciaRepository descuentoProcedenciaRepository;

    public ArrayList<DescuentoProcedenciaEntity> obtenerDescuentoProcedencias(){
        return (ArrayList<DescuentoProcedenciaEntity>) descuentoProcedenciaRepository.findAll();
    }

    public DescuentoProcedenciaEntity guardarDescuentoProcedencia(DescuentoProcedenciaEntity usuario){
        return descuentoProcedenciaRepository.save(usuario);
    }

    public Optional<DescuentoProcedenciaEntity> obtenerPorId(Long id){
        return descuentoProcedenciaRepository.findById(id);
    }

    public boolean eliminarDescuentoProcedencia(Long id) {
        try{
            descuentoProcedenciaRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }

}