package com.dio.Pratico3;

public class Main {

    public static void main(String[] args) {

        System.out.println("Exercício Retornos");

        double areaQuadrado = Quadrilatero.area(4);
        System.out.println("Área do Quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 3);
        System.out.println("Área do Retangulo: " + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8, 9);
        System.out.println("Área do Trapezio: " + areaTrapezio);
    }
}
