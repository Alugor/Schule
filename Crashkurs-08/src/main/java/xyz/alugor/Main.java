package xyz.alugor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib eine Zahl ein: ");
        String input = scan.next();

        try {
            int limit = Integer.parseInt(input);
            StringBuilder output = new StringBuilder();
            for (int i = 0; i < limit; i++) {
                output.append(i).append(", ");
            }
            System.out.println(output.substring(0, output.length() - 2));
        } catch (NumberFormatException e) {
            System.out.println("Bitte gib eine Zahl an! Starte das Programm neu.");
        }
    }
}