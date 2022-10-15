package com.dio.pratico1;

public class Calculadora {
    public static void soma(double num1, double num2) {
        //adição
        double resultado = num1 + num2;

        System.out.println("a soma de " + num1 + "mais " + num2 + "é " + resultado);

    }

    public static void subtracao(double num1, double num2) {
        //subtração
        double resultado = num1 - num2;

        System.out.println("a subtração de " + num1 + "menos " + num2 + "é " + resultado);

    }

    public static void multiplicacao(double num1, double num2) {
        //Multiplicação
        double resultado = num1 * num2;

        System.out.println(num1 + "vezes " + num2 + "é " + resultado);

    }

    public static void divisao(double num1, double num2) {
        //Divisão
        double resultado = num1 / num2;

        System.out.println(num1 + "dividido por " + num2 + "é " + resultado);

    }
}