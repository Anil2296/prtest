package src.main.java;

import java.util.Random;

public class RandomTest {

    public static void main(String[] args) {
        boolean testResult = generateRandomBoolean();  // Generate random true or false

        // Print the result to show if the PR should be accepted or rejected
        if (testResult) {
            System.out.println("GitHub status: Accept");  // If true, the PR is accepted
        } else {
            System.out.println("GitHub status: Reject");  // If false, the PR is rejected
        }

        // Exit with 0 (success) if true, 1 (failure) if false
        System.exit(testResult ? 0 : 1);
    }

    // Method to generate random true or false
    public static boolean generateRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();  // Randomly returns true or false
    }
}

