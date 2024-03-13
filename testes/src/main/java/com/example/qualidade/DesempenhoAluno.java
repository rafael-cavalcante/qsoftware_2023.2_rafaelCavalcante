package com.example.qualidade;

/*
Especificação
O programa “Desempenho do Aluno” exibe, após receber três
notas de um aluno, seu resultado. O programa aceita 1, 2 ou 3
argumentos de entrada. Estes argumentos são números inteiros
referentes às notas do aluno.

● A menor nota possível é 0.
● A maior nota possível é 100.

● No caso de entradas inválidas, o status deve ser “Erro”.
*/

public class DesempenhoAluno {
    // ● Antes do cálculo da nota final, seu status deve ser a string vazia.
    private String status = "";

    /*
     * ● Se invocado com 1 argumento, presume-se que este dado seja
     * referente à primeira nota do aluno, sendo informadas as próximas
     * duas no futuro e retornará um status textual vazio.
     */
    public String calcularMedia(int nota1) {
        if (nota1 < 0 || nota1 > 100) {
            this.status = "Erro";
        }

        return this.status;
    }

    /*
     * ● Se invocado com 2 argumentos, presume-se que estes dados
     * sejam referentes às duas primeiras notas do aluno, sendo
     * informada a terceira no futuro e retornará um status textual vazio.
     */
    public String calcularMedia(int nota1, int nota2) {
        if (nota1 < 0 || nota1 > 100) {
            this.status = "Erro";
        } else if (nota2 < 0 || nota2 > 100) {
            this.status = "Erro";
        }

        return this.status;
    }

    /*
     * ● Se invocado com 3 argumentos, serão estas as três notas do
     * aluno, e o programa calculará o resultado médio e retornará um
     * status textual associado ao seu desempenho.
     */
    public String calcularMedia(int nota1, int nota2, int nota3) {
        if (nota1 < 0 || nota1 > 100) {
            this.status = "Erro";
        } else if (nota2 < 0 || nota2 > 100) {
            this.status = "Erro";
        } else if (nota3 < 0 || nota3 > 100) {
            this.status = "Erro";
        }

        int media = (nota1 + nota2 + nota3) / 3;

        /*
         * ● Caso a nota final do aluno seja < 60, seu status será “Reprovado”.
         * ● Caso a nota final do aluno seja >= 60, seu status será “D”.
         * ● Caso a nota final do aluno seja >= 70, seu status será “C”.
         * ● Caso a nota final do aluno seja >= 80, seu status será “B”.
         * ● Caso a nota final do aluno seja >= 90, seu status será “A”.
         */
        if (media < 60) {
            this.status = "Reprovado";
        } else if (media >= 90) {
            this.status = "A";
        } else if (media >= 80) {
            this.status = "B";
        } else if (media >= 70) {
            this.status = "C";
        } else if (media >= 60) {
            this.status = "D";
        }

        return this.status;
    }
}
