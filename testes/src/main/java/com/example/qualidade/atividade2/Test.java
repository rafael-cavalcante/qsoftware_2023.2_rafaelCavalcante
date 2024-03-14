package com.example.qualidade.atividade2;

public class Test {
    public static void main(String[] args) {
        Nutricionista nutricionista = new Nutricionista();
        Usuario usuario = new Usuario();
        Sistema sistema = new Sistema();

        usuario.setNome("Rafael");
        usuario.setAltura(1.90);
        usuario.setCpf("01808267435");
        usuario.setPeso(70);

        nutricionista.setNome("Sairo");
        nutricionista.setCrn("AG123456");

        String result = sistema.calcularImc(usuario, nutricionista);

        System.out.println(result);
    }
}
