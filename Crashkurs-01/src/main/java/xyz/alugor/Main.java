package xyz.alugor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Vorname: \t");
        String vorname = scan.next();

        System.out.print("Nachname: \t");
        String name = scan.next();

        System.out.print("Alter: \t\t");
        String alter = scan.next();

        System.out.print("Danke für die Eingabe!");
    }
}