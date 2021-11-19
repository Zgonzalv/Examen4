package com.example.Examen4.controller;

import com.example.Examen4.entity.Alumno;
import com.example.Examen4.repository.AlumnoRepository;
import com.example.Examen4.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AlumnoController {

        @Autowired
        private AlumnoService service;

        @PostMapping
        public ResponseEntity<Alumno>addAlumno(@RequestBody Alumno alumno){
            System.out.println("Se hizo la solicitud");
            service.AddAlumno(alumno);
            return ResponseEntity.ok(alumno);
        }
    @GetMapping("/{pornombre}/{nombrevariable}")
    public Alumno getAlumnoByName(@PathVariable("nombrevariable") String name) {
            return service.getAlumno(name);
    }

}
