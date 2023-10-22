package Lab4DavydaKI304;

/**
 * The {@code ExpressionCalculator} calculates the result of the expression y = 2x/sin(x).
 */
public class ExpressionCalculator {
    /**
     * Calculates the result of the expression y = 2x/sin(x).
     *
     * @param x The value of x in the expression.
     * @return The calculated result y.
     * @throws ArithmeticException if division by zero or a value very close to zero occurs.
     */
    public static double calculateExpression(double x) throws ArithmeticException {
        // Check if the denominator (sin(x)) is very close to zero
        double denominator = Math.sin(x);
        // Check if the denominator is very close to zero
        if (Math.abs(denominator) < 1e-10) {
            throw new ArithmeticException("Division by zero or a value very close to zero.");
        }
        // Calculate the expression
        return 2 * x / denominator;
    }
}
