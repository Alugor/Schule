package xyz.alugor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib deine Punktzahl ein: (?/?) ");
        String input = scan.next();

        try {
            String[] split = input.split("/");

            double points = Double.parseDouble(split[0]);
            double max = Double.parseDouble(split[1]);

            double percentage = points / max*100;
            if (percentage >= 92) {
                System.out.println("Sehr gut!");
            } else if (percentage >= 81) {
                System.out.println("Gut!");
            } else if (percentage >= 67) {
                System.out.println("Befriedigend!");
            } else if (percentage >= 50) {
                System.out.println("Ausreichend!");
            } else if (percentage >= 30) {
                System.out.println("Mangelhaft!");
            } else {
                System.out.println("Ungenügend!");
            }
        } catch (NumberFormatException e) {
            System.out.println("Bitte gib eine Zahl an! Starte das Programm neu.");
        }
    }
}