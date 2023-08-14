package xyz.alugor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib den zu rundenden Betrag ein: ");
        String input = scan.next();

        try {
            double number = Double.parseDouble(input);
            System.out.println("Gerundet: " + (int) number);
        } catch (NumberFormatException e) {
            System.out.println("Bitte gib eine Zahl an! Starte das Programm neu.");
        }
    }
}