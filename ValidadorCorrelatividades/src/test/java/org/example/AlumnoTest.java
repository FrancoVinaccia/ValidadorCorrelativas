package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    public void testGetNombre() {
        Alumno alumno = new Alumno("Juan");
        assertEquals("Juan", alumno.getNombre());
    }
    @Test
    public void testAproboMateria() {
        Alumno alumno = new Alumno("Juan");
        Materia materia = new Materia("Matematica");
        alumno.agregarMateriaAprobada(materia);
        assertTrue(alumno.aproboMateria(materia));
    }
}