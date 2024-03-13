package com.example.qualidade;

public class Desempenho {
    
    public String calcularNota(int nota1){
        if (nota1 < 0 || nota1 > 100){
            return "Erro";
        }
        return "";
    }

    public String calcularNota(int nota1, int nota2){
        if (nota1 < 0 || nota1 > 100){
            return "Erro";
        } else if (nota2 < 0 || nota2 > 100){
            return "Erro";
        }
        return "";
    }

    public String calcularNota(int nota1, int nota2, int nota3){
        if (nota1 < 0 || nota1 > 100){
            return "Erro";
        } else if (nota2 < 0 || nota2 > 100){
            return "Erro";
        } else if (nota3 < 0 || nota3 > 100){
            return "Erro";
        }

        int notaFinal = (nota1 + nota2 + nota3) / 3;

        if(notaFinal < 60){
            return "Reprovado";
        } else if (notaFinal < 70){
            return "D";
        } else if (notaFinal < 80){
            return "C";
        } else if (notaFinal < 90){
            return "B";
        } 

        return "A";
    }
}
