package Controller;

import Model.Alumno;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoController {

    private List<Alumno> alumnos = new ArrayList<>(Arrays.asList(
            new Alumno(1, "Juan Arguello", "arguellis17@gmail.com", 21, "Ingenieria"),
            new Alumno(2, "Alex Valles", "alexv02@gmail.com", 21, "Diseñador"),
            new Alumno(3, "Diego Garcia", "diegog04@gmail.com", 21, "Software"),
            new Alumno(4, "Andree Huesca", "andreeh22@gmail.com", 18, "Mecanica"),
            new Alumno(5, "Greg Pacheco", "gregp055@gmail.com", 23, "Ingenieria")
    ));

    // Se agrega la anotacion @GetMapping para indicar que este metodo se ejecutara cuando se reciba una peticion GET
    @GetMapping("/alumnos")
    public List<Alumno> getAlumnos() {
        return alumnos;
    }
}
