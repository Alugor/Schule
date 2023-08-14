package xyz.alugor;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bitte gib einen Betrag ein: ");
        String input = scan.next();

        try {
            int number = Integer.parseInt(input);
            System.out.println(Arrays.toString(rand(number)));
        } catch (NumberFormatException e) {
            System.out.println("Bitte gib eine Zahl an! Starte das Programm neu.");
        }
    }

    private static int[] rand(int num) {
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = new Random().nextInt(6) + 1;
        }
        return nums;
    }
}