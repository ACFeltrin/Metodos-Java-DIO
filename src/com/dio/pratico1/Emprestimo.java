package com.dio.pratico1;

public class Emprestimo {

    public static int getDuasParcelas() {
        return 2;

    }
    public static int getTresParcelas() {
        return 3;

    }
    public static double getTaxaDuasparcelas() {
        return 0.3;

    }
    public static double getTaxaTresparcelas() {
        return 0.45;

    }

    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasparcelas());

            System.out.println("valor final do empréstimo para duas parcelas: R$ " + valorFinal);

        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresparcelas());

            System.out.println("valor final do empréstimo para três parcelas: R$ " + valorFinal);

        } else {

            System.out.println("Quantidade de parcelas não aceita.");

        }
        }

    }
