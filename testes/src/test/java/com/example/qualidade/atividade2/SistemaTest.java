package com.example.qualidade.atividade2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class SistemaTest {
    private Nutricionista nutricionista;
    private Usuario usuario;
    private Sistema sistema;

    @Before
    public void inicializar() {
        this.nutricionista = new Nutricionista();
        this.usuario = new Usuario();
        this.sistema = new Sistema();
    }

    @Test
    public void pesoIgualZero() {
        this.usuario.setNome("Rafael");
        this.usuario.setAltura(1.7);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(0);

        this.nutricionista.setNome("Sairo");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertEquals("Valor inválido", result);
    }

    @Test
    public void tresNotasCinquenta() {
        this.usuario.setNome("Rafael");
        this.usuario.setAltura(1.7);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(55);

        this.nutricionista.setNome("Sairo");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Saudável" == result);
    }
}
