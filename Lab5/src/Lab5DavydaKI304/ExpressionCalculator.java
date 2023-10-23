package Lab5DavydaKI304;

/**
 * The {@code ExpressionCalculator} class calculates the result of the expression y = 2x/sin(x).
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
        //Перевіряю, чи знаменник (sin (x)) дуже близький до нуля
        double denominator = Math.sin(x);
        //Перевіряю, чи знаменник дуже близький до нуля
        if (Math.abs(denominator) < 1e-10) {
            throw new ArithmeticException("Ділення на нуль або значення дуже близьке до нуля.");
        }
        //Обчислення виразу
        return 2 * x / denominator;
    }
}
