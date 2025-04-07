package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    public void testGetNombre() {
        Materia materia = new Materia("Matematica");
        assertEquals("Matematica", materia.getNombre());
    }

    @Test
    public void testAgregarCorrelativa() {
        Materia materia1 = new Materia("Matematica");
        Materia materia2 = new Materia("Fisica");
        materia1.agregarCorrelativa(materia2);
        assertTrue(materia1.getCorrelativas().contains(materia2));
    }
}