package main.java;



import java.util.Random;

public class RandomPRCheck {
    public static void main(String[] args) {
        // Generate a random boolean value (true or false)
        boolean randomResult = new Random().nextBoolean();

        // Print the result
        System.out.println("Random result: " + randomResult);

        // Exit code 0 for success, 1 for failure
        if (randomResult) {
            System.out.println("OK, you can mrge!");
            System.exit(0);  // Success exit code (OK to merge)
        } else {
            System.out.println("Sorry, you cannot merge.");
            System.exit(1);  // Failure exit code (Cannot merge)
        }
    }
}
