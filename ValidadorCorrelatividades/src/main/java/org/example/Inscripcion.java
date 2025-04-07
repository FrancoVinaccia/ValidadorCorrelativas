package org.example;

import java.util.List;
import java.util.ArrayList;

public class Inscripcion {
    private Alumno alumno;
    private List<Materia> materiasInscripcion;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasInscripcion = new ArrayList<>();
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public List<Materia> getMaterias() {
        return materiasInscripcion;
    }

    public Boolean aprobada() {
        return materiasInscripcion.stream().flatMap(materia -> materia.getCorrelativas().stream())
                .allMatch(correlativa -> alumno.aproboMateria(correlativa));
    }
}
