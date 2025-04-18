package com.example.student_mangament.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Alumno {

    private int id;
    private String nombre;
    private String email;
    private int edad;
    private String curso;
}
