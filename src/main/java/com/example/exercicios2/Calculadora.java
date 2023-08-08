package com.example.exercicios2;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("escolha uma operação"+
                "\n 1: soma"+
                "\n 2: subtração"+
                "\n 3: divisão"+
                "\n 4: multiplicação");
        int operacao = scanner.nextInt();

        System.out.println("escolha o primeiro numero"+
                "\n escolha o segundo numero");
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        switch (operacao){
            case 1:
                System.out.println(x + y);
                break;
            case 2:
                System.out.println(x - y);
                break;
            case 3:
                System.out.println(x / y);
            case 4:
                System.out.println(x * y);
                break;
        }
    }
}