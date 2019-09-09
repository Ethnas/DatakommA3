package no.ntnu.datakomm.a3;

import java.util.Random;
import java.util.Scanner;

/**
 * Implement the "features", place your code where the TODO tags are. 
 * Read description of assignment A3 to understand the details.
 */
public class MyClass {

    private static void feature1() {
        // TODO - print "Feature #1"
    }

    private static void feature2() {
        // TODO - print "Feature #2"
    }

    private static void feature3() {
        System.out.println("Generate a random number.");
        Random random = new Random();
        random.setSeed(getSeedFromUser());
        int rnd = random.nextInt();
        System.out.println("This is the random number: " + rnd);
    }

    private static void feature4() {
        // TODO - print "Feature #4"
    }

    private static long getSeedFromUser()
    {
        System.out.println("Please enter the seed to use: ");
        Scanner reader = new Scanner(System.in);
        long seed = reader.nextLong();
        return seed;
    }

    private static void feature5() {
        System.out.println("Feature #5");
    }

    public static void main(String[] args) {
        System.out.println("The following features are implemented:");
        feature1();
        feature2();
        feature3();
        feature4();
        feature5();
    }
}
