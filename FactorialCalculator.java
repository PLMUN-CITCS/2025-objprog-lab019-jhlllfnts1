import java.util.Scanner;

public class FactorialCalculator {

    // Method to get a valid non-negative integer from the user
    public static int getNonNegativeInteger() {
        Scanner scanner = new Scanner(System.in);
        int num;

        while (true) {
            System.out.print("Enter a non-negative integer: ");
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 0) {
                    break;
                } else {
                    System.out.println("Error: Please enter a non-negative integer.");
                }
            } else {
                System.out.println("Error: Invalid input. Please enter an integer.");
                scanner.next(); // Clear invalid input
            }
        }
        return num;
    }

    // Method to calculate the factorial of a non-negative integer
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Main method to run the program
    public static void main(String[] args) {
        int number = getNonNegativeInteger();
        long result = calculateFactorial(number);
        System.out.println("The factorial of " + number + " is " + result + ".");
    }
}