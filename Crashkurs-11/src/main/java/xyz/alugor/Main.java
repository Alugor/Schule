package xyz.alugor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        while (true) {
            System.out.println("Geben Sie eine Kommazahl ein oder 'ende' zum Beenden:");
            String eingabe = scanner.nextLine();

            if ("ende".equalsIgnoreCase(eingabe)) {
                break;
            }

            try {
                int zahl = Integer.parseInt(eingabe);
                list.add(zahl);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine gültige Zahl ein oder 'ende' zum Beenden.");
            }
        }

        if (list.isEmpty()) {
            System.out.println("Keine Zahlen eingegeben.");
            return;
        }

        list.sort(Collections.reverseOrder());

        StringBuilder output = new StringBuilder();
        list.forEach(item -> output.append(item).append(", "));
        System.out.println(output.substring(0, output.length() - 2));
    }
}