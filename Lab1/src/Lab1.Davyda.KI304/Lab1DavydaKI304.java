package Lab1DavydaKI304;

import java.io.*;
import java.util.*;

/**
 * Lab1DavydaKI304.Lab1DavydaKI304 - A program to generate and display a pattern of characters
 *  * in the form of a square matrix, with user-defined size and filler character.
 *  * The resulting pattern is written to a text file named "MyLab1.txt".
 *
 * @author Davyda Vladyslav KI-304
 */
public class Lab1DavydaKI304 {
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;       // Розмір квадратної матриці (кількість рядків і стовпців)
        char[][] arr;    // Масив символів для зберігання
        String filler;
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyLab1.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        // Запиc користувача на розмір квадратної матриці
        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        // Запиc користувача для символу наповнювача
        System.out.print("Введіть символ-заповнювач: ");
        filler = in.nextLine();
        arr = new char[nRows][];
        int halfNRows = (nRows / 2) + 1;
        int point = halfNRows-1;
        if(nRows % 2 == 0){
            point--;
        }
        int row = 0;
        if (nRows % 2 == 0){
            row = nRows - 1;
            nRows -= 1;
        }
        else {
            row = nRows;
        }
        // Заповнення верхньої половини матриці
        for (int i = 0; i < halfNRows-1; i++) {
            arr[i] = new char[row];
            for (int j = 0; j < row; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
            row -= 2;
        }
        //  Заповнення нижньої половини матриці
        if (row == -1 && nRows % 2 == 1){
            row += 4;
        }
        else {
            row = 1;
        }
        for (int i = halfNRows-1; i < nRows; i++) {
            arr[i] = new char[row];
            for (int j = 0; j < row; j++) {
                arr[i][j] = (char) filler.codePointAt(0);
            }
            row += 2;
        }

        exit:
        // Перевірка наявності символу-заповнювача та його коректності
        if (filler.isEmpty()) {
            System.out.print("\nСимвол-заповнювач не введено.");
        } else if (filler.length() != 1) {
            System.out.print("\nВведено забагато символів-заповнювачів.");
        } else {
            int counter = 0;
            int colArr = 0, rowArr = 0;

            // Цикл для виведення матриці та запису її у файл
            for (int i = 0; i < nRows; i++) {
                for (int j = 0; j < nRows; j++) {
                    if (j >= counter && arr[rowArr].length > colArr) {
                        System.out.print(arr[rowArr][colArr] + " ");
                        fout.print(arr[rowArr][colArr] + " ");
                        colArr++;
                    } else {
                        System.out.print("  ");
                        fout.print("  ");
                    }

                }
                if (counter < point) {
                    counter++;
                }
                else{
                    counter--;
                    point--;
                }
                rowArr++;
                colArr = 0;
                System.out.print("\n");
                fout.print("\n");
            }
        }
        fout.flush();
        fout.close();
    }
}
