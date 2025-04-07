package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void testAprobada() {
        Alumno alumno = new Alumno("Juan");
        Materia materia1 = new Materia("Matematica");
        Materia materia2 = new Materia("Fisica");
        Materia materia3 = new Materia("Quimica");
        materia2.agregarCorrelativa(materia1);
        materia2.agregarCorrelativa(materia3);

        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.getMaterias().add(materia2);

        alumno.agregarMateriaAprobada(materia1);
        alumno.agregarMateriaAprobada(materia3);

        assertTrue(inscripcion.aprobada());
    }

}