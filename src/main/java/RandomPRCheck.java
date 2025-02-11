package main.java;




//mport java.util.Random;

public class RandomPRCheck {
    public static void main(String[] args) {
        // Generate a random boolean value (true or false)
        //boolean randomResult = new Random().nextBoolean();
        boolean randomResult=true;
        System.out.println("hi");
        System.out.println("hi");
        
        

        // Print the result
        //System.out.println("Random resul: " + randomResult);

        // Exit code 0 for success, 1 for failure
        if (randomResult) {
            System.out.println("OK, you can merge!");
            System.exit(0);  // Success exit code (OK to merge)
        } else {
            System.out.println("Sorry, to raa you cannot merge.");
            System.exit(1);  // Failure exit code (Cannot merge)
        }
    }
}
