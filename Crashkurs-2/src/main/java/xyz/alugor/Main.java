package xyz.alugor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib den zu versteuernden Betrag ein: ");
        String input = scan.next();

        try {
            int number = Integer.parseInt(input);
            System.out.println("Der Bruttobetrag entspricht: " + (number += (number * 19 / 100)));
        } catch (NumberFormatException e) {
            System.out.println("Bitte gib eine Zahl an! Starte das Programm neu.");
        }
    }
}