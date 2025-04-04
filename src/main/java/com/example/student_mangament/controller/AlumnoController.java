package com.example.student_mangament.controller;

import com.example.student_mangament.model.Alumno;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alumnos")
public class AlumnoController {

    private List<Alumno> alumnos = new ArrayList<>(Arrays.asList(
            new Alumno(1, "Juan Arguello", "arguellis17@gmail.com", 21, "Ingenieria"),
            new Alumno(2, "Alex Valles", "alexv02@gmail.com", 21, "Diseñador"),
            new Alumno(3, "Diego Garcia", "diegog04@gmail.com", 21, "Software"),
            new Alumno(4, "Andree Huesca", "andreeh22@gmail.com", 18, "Mecanica"),
            new Alumno(5, "Greg Pacheco", "gregp055@gmail.com", 23, "Ingenieria")
    ));

    // Consultar todos los alumnos
    @GetMapping
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    // Consultar un alumno por email
    @GetMapping("/{email}")
    public Alumno getAlumnoByEmail(@PathVariable String email) {
        for (Alumno alumno : alumnos) {
            if (alumno.getEmail().equalsIgnoreCase(email)) {
                return alumno;
            }
        }
        return null;
    }

    // Crear un nuevo alumno
    @PostMapping
    public Alumno postAlumno(@RequestBody Alumno alumno) {
        alumnos.add(alumno);
        return alumno;
    }

    // Actualizar un alumno existente
    @PutMapping
    public Alumno putAlumno(@RequestBody Alumno alumno) {
        for(Alumno a: alumnos){
            if(a.getId() == alumno.getId()){
                a.setNombre(alumno.getNombre());
                a.setEmail(alumno.getEmail());
                a.setEdad(alumno.getEdad());
                a.setCurso(alumno.getCurso());
                return a;
            }
        }
        return null;
    }

}
