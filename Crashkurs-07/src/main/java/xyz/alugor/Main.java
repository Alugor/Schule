package xyz.alugor;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int loops = 0;

        System.out.println("Es wird nach einer 10 gesucht.");
        while (true) {
            loops++;
            int random = new Random().nextInt(100);
            if (random == 10) {
                break;
            }
        }
        System.out.println(loops + " loops wurden gebraucht.");
    }
}