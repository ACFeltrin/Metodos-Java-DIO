package com.dio.pratico1;
public class Mensagem {

    public static void obterMensagem(int hora) {
        switch (hora){
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia();
                break;

            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;

            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;

            default:
                System.out.println("Hora Inválida");
                break;
        }

    }

    public static void mensagemBomDia() {
        System.out.println("Bom Dia!");

    }
    public static void mensagemBoaTarde() {
        System.out.println("Boa Tarde!");

    }
    public static void mensagemBoaNoite() {
        System.out.println("Boa Noite!");

    }
    //este abaixo é bem mais simples e mais prático que o apresentado na aula, pois tem a possibilidade de pegar horário real, como 10h30, 19h43 etc....
    //Mas não dispensa a forma apresentada pelo professor, pois ele apresentou outras formas de fazer, que tambem se encaixam em outros métodos


   /* public static void obterMensagem(double h1) {

        if (h1 <=11.59) {
            System.out.println("Bom dia!");
        } else if (h1 >= 12 && h1 < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa Noite!");
        }


    } */
}
