package Lab5DavydaKI304;

import java.io.IOException;
import java.util.Scanner;

/**
 * The {@code ExpressionCalculatorApp} class is a simple application for calculating and storing the result of an expression
 * defined by an expression calculator.
 */
public class ExpressionCalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Зчитуємо значення "x" від користувача
        System.out.print("Введіть значення x: ");
        double x = scanner.nextDouble();
        // Обчислюємо результат виразу
        double result = ExpressionCalculator.calculateExpression(x);
        try {
            // Записуємо результат у текстовий файл
            ExpressionResult.writeText(result, "result.txt");
            System.out.println("Результат записано у файл result.txt");
            // Записуємо результат у бінарний файл
            ExpressionResult.writeBinary(result, "result.dat");
            System.out.println("Результат записано у файл result.dat");
            // Зчитуємо результат з текстового файлу та виводимо його
            double textResult = ExpressionResult.readText("result.txt");
            System.out.println("Результат з текстового файлу: " + textResult);
            // Зчитуємо результат з бінарного файлу та виводимо його
            double binaryResult = ExpressionResult.readBinary("result.dat");
            System.out.println("Результат з бінарного файлу: " + binaryResult);
        } catch (IOException e) {
            System.err.println("Помилка: " + e.getMessage());
        }
    }
}
