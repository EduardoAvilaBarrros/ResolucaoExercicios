package com.example.exercicios2;

import java.util.Scanner;

public class Quiz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem Vindo ao Quiz!\n"+"Presione ENTER para continuar");
        String enter = scanner.nextLine();

        System.out.println("tgdgfdgfdgf:" + "\n a)- gjyjhhjgcf" + "\n b)- jvfgfdghcgfc" + "\n c)- bkjbdjhsbcjhbscjhsv");
        String resposta = scanner.nextLine();

        if (resposta == "a"){
            System.out.println("Acertou, parabens :0");
        }else{
            System.out.println("Errou, mais sorte da proxima vez");
        }

        System.out.println("tgdgfdgfdgf:" + "\n a)- gjyjhhjgcf" + "\n b)- jvfgfdghcgfc" + "\n c)- bkjbdjhsbcjhbscjhsv" +
                "d)- hdiusbcihsbciasbcibajcbasjvbxjhabxjhabxjhbasjhcbasjxbjhb");
        String resposta2 = scanner.nextLine();

        if (resposta2 == "d"){
            System.out.println("Acertou, parabens :0");
        }else{
            System.out.println("Errou, mais sorte da proxima vez");
        }

        System.out.println("tgdgfdgfdgf:" + "\n a)- gjyjhhjgcf" + "\n b)- jvfgfdghcgfc" + "\n c)- bkjbdjhsbcjhbscjhsv");
        String resposta3 = scanner.nextLine();

        if (resposta3 == "b"){
            System.out.println("Acertou, parabens :0");
        }else{
            System.out.println("Errou, mais sorte da proxima vez");
        }

        System.out.println("tgdgfdgfdgf:" + "\n a)- gjyjhhjgcf" + "\n b)- jvfgfdghcgfc" + "\nc)- bkjbdjhsbcjhbscjhsv");
        String resposta4 = scanner.nextLine();

        if (resposta4 == "c"){
            System.out.println("Acertou, parabens :0");
        }else{
            System.out.println("Errou, mais sorte da proxima vez");
        }
    }
}
