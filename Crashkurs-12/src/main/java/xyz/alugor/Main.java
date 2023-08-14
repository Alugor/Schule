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
        System.out.println("Summe: " + sum(list));
    }

    private static double sum(ArrayList<Double> values) {
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        return sum;
    }
}