package com.dio.pratico1;



public class Main {
    public static void main(String[] args) {

        //Calculadora
        System.out.println("Exercício Calculadora");
        Calculadora.soma    (3, 6);
        Calculadora.subtracao(9, 1.8);
        Calculadora.multiplicacao(7, 8);
        Calculadora.divisao(5, 2.5);

        //Mensagens
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(6);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(20);

        //Empréstimo
        System.out.println("Exercício Empréstimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
    }
}
