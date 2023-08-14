package xyz.alugor;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        while (true) {
            System.out.println("Geben Sie eine Kommazahl ein oder 'ende' zum Beenden:");
            String eingabe = scanner.nextLine();

            if ("ende".equalsIgnoreCase(eingabe)) {
                break;
            }

            try {
                double zahl = Double.parseDouble(eingabe);
                list.add(zahl);
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine gültige Kommazahl ein oder 'ende' zum Beenden.");
            }
        }

        if (list.isEmpty()) {
            System.out.println("Keine Zahlen eingegeben.");
            return;
        }

        double summe = 0;
        for (Double zahl : list) {
            summe += zahl;
        }

        double mittelwert = summe / list.size();

        System.out.println("Eingegebene Zahlen:");
        for (Double zahl : list) {
            System.out.println(zahl);
        }

        System.out.println("Arithmetisches Mittel: " + mittelwert);
    }
}