package com.example.exercicios2;

import java.util.Scanner;

public class TelaMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome the menu! Presione ENTER para continuar!");
        String enter = scanner.nextLine();

        while(true) {
            System.out.println("Keep reading until the end\n");
            System.out.println("Keep reading\n");
            System.out.println("Keep reading until the end, don't give up\n");
            System.out.println("Keep reading until the end, don't give up, you will feel accomplished\n");
            System.out.println("Please continue reading until the end.\n");
            System.out.println("Seriously don't give up\n");
            System.out.println("Something awaits you in the end, don't give up\n");
            System.out.println("You've come this far, don't give up!\n");
            System.out.println("You're almost done. Are you really going to give up here?\n");
            System.out.println("Just one more message and you will reach the end!\n");
            System.out.println("I was kidding!!!\n");
            System.out.println("Now it's the last one seriously, I swear :0\n");
            System.out.println("For those of you who arrived here: YOU ARE A VERY SPECIAL PERSON," +
                    "if you endured this list of stressful messages you can endure this world a little longer!\n");
        }
    }
}