package Lab4DavydaKI304;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * The {@code ExpressionCalculatorApp} class is a program driver for calculating the
 * expression and saving the result to a file.
 */
public class ExpressionCalculatorApp {
    public static void main(String[] args) {
        // Read the value of x from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();
        // Calculate the expression y
        double y;
        try {
            y = ExpressionCalculator.calculateExpression(x);
        } catch (ArithmeticException e) {
            // Handle errors such as division by zero
            System.err.println("Error calculating the expression: " + e.getMessage());
            return;
        }
        // Write the result to a file
        try (PrintWriter writer = new PrintWriter(new FileWriter("result.txt"))) {
            writer.println("Result of calculating the expression: " + y);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
        System.out.println("Result of calculating the expression: " + y);
    }
}
