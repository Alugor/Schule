package xyz.alugor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib einen Betrag ein: ");
        String input = scan.next();

        try {
            int number = Integer.parseInt(input);
            System.out.println(number >= 18 ? "Bitteschön, ein Bier!" : "Bitteschön, eine Limonade!");
        } catch (NumberFormatException e) {
            System.out.println("Bitte gib eine Zahl an! Starte das Programm neu.");
        }
    }
}