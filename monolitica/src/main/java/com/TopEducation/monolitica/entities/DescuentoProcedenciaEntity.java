package com.TopEducation.monolitica.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "DescuentoProcedencia")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DescuentoProcedenciaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;
    private String TipoColegio;
    private int Descuento;

}
