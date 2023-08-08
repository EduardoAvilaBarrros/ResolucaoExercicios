package com.example.exercicios2;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro numero do seu triangulo:"+
                "\n Informe o segundo numero do seu triangulo"+
                "\n Informe o terceiro numero do seu triangulo");
        int lado1 = scanner.nextInt();
        int lado2 = scanner.nextInt();
        int lado3 = scanner.nextInt();

        if (lado1 == lado2 && lado2 == lado3){
            System.out.println("Seu triangulo é equilatero");
        } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
            System.out.println("Seu triangulo é isoceles");
        } else {
            System.out.println("Seu triangulo é escaceno");
        }
    }
}
