package com.example.qualidade;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class DesempenhoAlunoTest {
    private DesempenhoAluno desempenhoAluno;

    @Before
    public void inicializar() {
        desempenhoAluno = new DesempenhoAluno();
    }

    @Test
    public void umaNota() {
        String result = desempenhoAluno.calcularMedia(75);
        assertEquals("", result);
    }

    @Test
    public void duasNotas() {
        String result = desempenhoAluno.calcularMedia(75, 75);
        assertEquals("", result);
    }

    @Test
    public void tresNotas() {
        String result = desempenhoAluno.calcularMedia(75, 75, 75);
        assertEquals("C", result);
    }

    @Test
    public void umaNotaMenorQueZero() {
        String result = desempenhoAluno.calcularMedia(-10);
        assertEquals("Erro", result);
    }

    @Test
    public void umaNotaMaiorQueCem() {
        String result = desempenhoAluno.calcularMedia(75, 110);
        assertEquals("Erro", result);
    }

    @Test
    public void tresNotasCinquenta() {
        String result = desempenhoAluno.calcularMedia(50, 50, 50);
        assertTrue("Reprovado" == result);
    }

    @Test
    public void tresNotasSessenta() {
        String result = desempenhoAluno.calcularMedia(60, 60, 60);
        assertTrue("D" == result);
    }

    @Test
    public void tresNotasSetenta() {
        String result = desempenhoAluno.calcularMedia(70, 70, 70);
        assertTrue("C" == result);
    }

    @Test
    public void tresNotasOitenta() {
        String result = desempenhoAluno.calcularMedia(80, 80, 80);
        assertTrue("B" == result);
    }

    @Test
    public void tresNotasNoventa() {
        String result = desempenhoAluno.calcularMedia(90, 90, 90);
        assertTrue("A" == result);
    }
}
