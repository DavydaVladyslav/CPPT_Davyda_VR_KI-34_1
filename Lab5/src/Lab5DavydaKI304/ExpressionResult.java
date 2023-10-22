package Lab5DavydaKI304;

import java.io.*;

/**
 * The {@code ExpressionResult} class provides methods for reading and writing expression results in both text and binary formats.
 */
public class ExpressionResult {
    /**
     * Записую результат виразу у текстовий файл.
     *
     * @param result  Результат для запису.
     * @param txtFile Текстовий файл, у який буде виконано запис.
     * @throws IOException Якщо сталася помилка під час запису у файл.
     */
    public static void writeText(double result, String txtFile) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(txtFile))) {
            writer.println("Результат: " + result);
        }
    }

    /**
     * Зчитую результат виразу з текстового файлу.
     *
     * @param txtFile Текстовий файл, з якого буде виконано читання.
     * @return Зчитаний результат.
     * @throws IOException Якщо сталася помилка під час читання з файлу.
     */
    public static double readText(String txtFile) throws IOException {
        double result = 0.0;
        try (BufferedReader reader = new BufferedReader(new FileReader(txtFile))) {
            String line = reader.readLine();
            if (line != null && line.startsWith("Результат:")) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    result = Double.parseDouble(parts[1].trim());
                }
            }
        }
        return result;
    }

    /**
     * Записую результат виразу у бінарний файл.
     *
     * @param result  Результат для запису.
     * @param binFile Бінарний файл, у який буде виконано запис.
     * @throws IOException Якщо сталася помилка під час запису у файл.
     */
    public static void writeBinary(double result, String binFile) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(binFile))) {
            oos.writeDouble(result);
        }
    }

    /**
     * Зчитую результат виразу з бінарного файлу.
     *
     * @param binFile Бінарний файл, з якого буде виконано читання.
     * @return Зчитаний результат.
     * @throws IOException Якщо сталася помилка під час читання з файлу.
     */
    public static double readBinary(String binFile) throws IOException {
        double result = 0.0;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(binFile))) {
            result = ois.readDouble();
        }
        return result;
    }
}
