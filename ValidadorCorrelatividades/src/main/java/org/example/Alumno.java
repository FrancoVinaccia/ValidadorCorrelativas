package org.example;

import java.util.List;
import java.util.ArrayList;

public class Alumno {
    private String nombre;
    private List<Materia> materiasAprobadas;

    public Alumno(String nombre) {
        this.nombre = nombre;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public Boolean aproboMateria(Materia materia) {
        return materiasAprobadas.contains(materia);
    }

    public void agregarMateriaAprobada(Materia materia) {
        materiasAprobadas.add(materia);
    }
}
