package com.example.qualidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DesempanhoTest {
    Desempenho d;

    @Before
    public void criar() {
        d = new Desempenho();
    }

    @Test
    public void umaEntradaValida() {
        String resultado = d.calcularNota(70);
        assertEquals("", resultado);
    }

    @Test
    public void umaEntradaMenorQueZero() {
        String resultado = d.calcularNota(-1);
        assertEquals("Erro", resultado);
    }

    @Test
    public void duasEntradaAcimaDeCem() {
        String resultado = d.calcularNota(120, 101);
        assertTrue("Erro" == resultado);
    }
    
    @Test
    public void tresEntradasInteiros() {
        String resultado = d.calcularNota(80, 60, 100);
        assertEquals("B", resultado);
    }
}
