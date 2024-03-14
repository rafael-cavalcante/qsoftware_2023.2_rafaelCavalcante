package com.example.qualidade.atividade2;

public class Sistema {
    public String calcularImc(Usuario usuario, Nutricionista nutricionista) {

        if (usuario.getPeso() <= 0) {
            return "Valor inválido";
        } else if (usuario.getAltura() <= 0) {
            return "Valor inválido";
        }

        if (usuario.getNome() == "" || nutricionista.getNome() == "") {
            return "Campo em branco";
        } else if (usuario.getNome().contains(" ") || nutricionista.getNome().contains(" ")) {
            return "Valor inválido";
        }

        if (usuario.getCpf().length() != 11) {
            return "Valor inválido";
        }

        if (nutricionista.getCrn().length() < 8 || nutricionista.getCrn().length() > 10) {
            return "Valor inválido";
        }

        double imc = usuario.getPeso() / Math.pow(usuario.getAltura(), 2);

        /*
         * IMC < 16: magreza grave
         * Entre 16 e 17: magreza moderada
         * Entre 17 e 19: magreza leve
         * Entre 19 e 25: saudável
         * Entre 25 e 30: sobrepeso
         * Entre 30 e 35: obesidade grau 1
         * Entre 35 e 40: obesidade grau 2
         */

         System.out.println(imc);

        if (imc < 16) {
            return "Magreza grave";
        } else if (imc >= 16 & imc < 17) {
            return "Magreza moderada";
        } else if (imc >= 17 & imc < 19) {
            return "Magreza leve";
        } else if (imc >= 19 & imc < 25) {
            return "Saudável";
        } else if (imc >= 25 & imc < 30) {
            return "Sobrepeso";
        } else if (imc >= 30 & imc < 35) {
            return "Obesidade grau 1";
        } else if (imc >= 35 & imc < 40) {
            return "Obesidade grau 2";
        }

        return "Valor invalido";
    }
}
