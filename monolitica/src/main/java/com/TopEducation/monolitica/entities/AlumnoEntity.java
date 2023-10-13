package com.TopEducation.monolitica.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "Alumnos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlumnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String RUT;
    private String Apellidos;
    private String Nombres;
    private String FechaNacimiento;
    private String ColegioProcedencia;
    private String NombreColegio;
    private Date AnoEgreso;

}
