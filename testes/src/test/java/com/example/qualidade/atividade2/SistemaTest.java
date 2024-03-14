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
        this.usuario.setNome("Rafael Cavalcante");
        this.usuario.setAltura(1.7);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(0);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertEquals("Valor inválido", result);
    }

    @Test
    public void primeiroNome() {
        this.usuario.setNome("Rafael");
        this.usuario.setAltura(1.70);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(50);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertEquals("Valor inválido", result);
    }

    @Test
    public void cpfCurto() {
        this.usuario.setNome("Rafael Cavalcante");
        this.usuario.setAltura(1.70);
        this.usuario.setCpf("018082674");
        this.usuario.setPeso(50);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertEquals("Valor inválido", result);
    }

    @Test
    public void crnCurto() {
        this.usuario.setNome("Rafael Cavalcante");
        this.usuario.setAltura(1.70);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(50);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG1234");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertEquals("Valor inválido", result);
    }

    @Test
    public void resultadoCampoEmBranco() {
        this.usuario.setNome("");
        this.usuario.setAltura(1.70);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(50);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Campo em branco" == result);
    }

    @Test
    public void resultadoSaudavel() {
        this.usuario.setNome("Rafael Cavalcante");
        this.usuario.setAltura(1.7);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(55);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Saudável" == result);
    }

    @Test
    public void resultadoSobrepeso() {
        this.usuario.setNome("Gilwan Souza");
        this.usuario.setAltura(1.7);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(80);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Sobrepeso" == result);
    }

    @Test
    public void resultadoObesidadeGrauUm() {
        this.usuario.setNome("Gilwan Souza");
        this.usuario.setAltura(1.80);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(110);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Obesidade grau 1" == result);
    }

    @Test
    public void resultadoObesidadeGrauDois() {
        this.usuario.setNome("Gilwan Souza");
        this.usuario.setAltura(1.70);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(110);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Obesidade grau 2" == result);
    }

    @Test
    public void resultadoMagrezaGrave() {
        this.usuario.setNome("Gilwan Souza");
        this.usuario.setAltura(1.90);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(50);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Magreza grave" == result);
    }

    @Test
    public void resultadoMagrezaLeve() {
        this.usuario.setNome("Gilwan Souza");
        this.usuario.setAltura(1.90);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(65);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Magreza leve" == result);
    }

    @Test
    public void resultadoMagrezaModerada() {
        this.usuario.setNome("Gilwan Souza");
        this.usuario.setAltura(1.80);
        this.usuario.setCpf("01808267435");
        this.usuario.setPeso(55);

        this.nutricionista.setNome("Sairo Raoni");
        this.nutricionista.setCrn("AG123456");

        String result = this.sistema.calcularImc(usuario, nutricionista);
        assertTrue("Magreza moderada" == result);
    }
}
