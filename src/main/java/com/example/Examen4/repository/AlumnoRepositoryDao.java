package com.example.Examen4.repository;


import com.example.Examen4.entity.Alumno;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface AlumnoRepositoryDao extends CrudRepository<Alumno,Integer> {

//@Query(value = "Select nombre from Alumnos t where t.id=:id")
   // public List<String> findAlumno(Integer id);
}
