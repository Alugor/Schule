package xyz.alugor;

import java.util.Scanner;

public class Main {
    private static final String PASSWORD = "JavascriptIstFürPlebs";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Bitte gib ein Passwort ein: ");
            String input = scan.next();

            if (input.equals(PASSWORD)) {
                break;
            } else {
                System.out.println("Nope");
            }
        }
        System.out.println("Jap, bist drin.");
    }
}