package Lab3DavydaKI304;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * An abstract class representing a car.
 *
 * This abstract class serves as a blueprint for creating car objects with various characteristics,
 * including make, model, year of manufacture, price, color, and methods for working with car information.
 */
public abstract class Carr {
    private String make;
    private String model;
    private int year;
    private double price;
    private PrintWriter fout;
    private String color;

    /**
     * Конструктор за замовчуванням
     *
     * @throws FileNotFoundException
     */
    public Carr() throws FileNotFoundException {
        make = "";
        model = "";
        year = 0;
        price = 0.0;
        color = "";
        fout = new PrintWriter(new File("CarLog.txt"));
    }

    /**
     * Конструктор з параметрами
     *
     * @param make  Марка машини
     * @param model Модель машини
     * @param year  Рік випуску машини
     * @param price Ціна машини
     * @throws FileNotFoundException
     */
    public Carr(String make, String model, int year, double price) throws FileNotFoundException {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        fout = new PrintWriter(new File("CarLog.txt"));
    }

    /**
     * Метод для зміни ціни машини
     *
     * @param newPrice Нова ціна машини
     */
    public void setPrice(double newPrice) {
        price = newPrice;
        fout.println("Змінено ціну на " + newPrice);
        fout.flush();

    }

    /**
     * Метод для отримання поточної ціни машини
     *
     * @return Поточна ціна машини
     */
    public double getPrice() {
        return price;
    }

    /**
     * Метод для отримання повної інформації про машину
     *
     * @return Рядок з інформацією про машину
     */
    public String getFullInfo() {
        return "Марка: " + make + "\nМодель: " + model + "\nРік випуску: " + year + "\nЦіна: " + price;
    }

    /**
     * Метод для закриття файлу логу
     */
    public void closeLogFile() {
        fout.close();
    }

    /**
     * Метод для додавання коментаря до логу
     *
     * @param comment Коментар
     */
    public void addLogComment(String comment) {
        fout.println(comment);
        fout.flush();
    }

    /**
     * Метод для зміни кольору машини
     *
     * @param newColor Новий колір машини
     */
    public void setColor(String newColor) {
        color = newColor;
        fout.println("Змінено колір машини на " + newColor);
        fout.flush();
    }

    /**
     * Метод для отримання кольору машини
     *
     * @return Колір машини
     */
    public String getColor() {
        return color;
    }

}
