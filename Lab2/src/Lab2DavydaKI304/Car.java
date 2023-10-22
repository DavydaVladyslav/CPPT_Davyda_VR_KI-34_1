package Lab2DavydaKI304;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Class representing a car.
 *
 * This class allows creating car objects with various characteristics,
 * including make, model, year of manufacture, price, color, information about the engine,
 * maximum speed, and the engine's status.
 */
public class Car {
    private String make;
    private String model;
    private int year;
    private double price;
    private PrintWriter fout;
    private Engine engine; // Об'єкт класу "Двигун"
    private MaxSpeed maxSpeed; // Об'єкт класу "Максимальна швидкість"

    private String color; // Колір машини
    private boolean isEngineRunning; // Поле, що вказує, чи працює двигун

    /**
     * Конструктор за замовчуванням
     *
     * @throws FileNotFoundException
     */
    public Car() throws FileNotFoundException {
        make = "";
        model = "";
        year = 0;
        price = 0.0;
        engine = new Engine(); // Ініціалізуємо об'єкт "Двигун"
        maxSpeed = new MaxSpeed(); // Ініціалізуємо об'єкт "Максимальна швидкість"
        color = "";
        isEngineRunning = false;
        fout = new PrintWriter(new File("CarLog.txt"));
    }

    /**
     * Конструктор з параметрами
     *
     * @param make     Марка машини
     * @param model    Модель машини
     * @param year     Рік випуску машини
     * @param price    Ціна машини
     * @param maxSpeed Об'єкт класу Максимальна швидкість
     * @param engine   Об'єм класу двигуна
     * @throws FileNotFoundException
     */
    public Car(String make, String model, int year,
               double price, MaxSpeed maxSpeed, Engine engine) throws FileNotFoundException {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        fout = new PrintWriter(new File("Car.txt"));
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
     * Метод для запуску двигуна машини
     */
    public void startEngine() {
        isEngineRunning = true;
        fout.println("Двигун машини було запущено.");
        fout.flush();
    }

    /**
     * Метод для перевірки стану двигуна
     *
     * @return true, якщо двигун запущено; false, якщо двигун вимкнено
     */
    public boolean isEngineRunning() {
        return isEngineRunning;
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
     * Отримати об'єкт "Двигун".
     *
     * @return Об'єкт класу "Двигун"
     */
    public Engine getEngine() {
        return engine;
    }
    /**
     * Встановити об'єкт "Двигун".
     *
     * @param engine Об'єкт класу "Двигун"
     */
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    /**
     * Отримати об'єкт "Максимальна швидкість".
     *
     * @return Об'єкт класу "Максимальна швидкість"
     */
    public MaxSpeed getMaxSpeed() {
        return maxSpeed;
    }
    /**
     * Встановити об'єкт "Максимальна швидкість".
     *
     * @param maxSpeed Об'єкт класу "Максимальна швидкість"
     */
    public void setMaxSpeed(MaxSpeed maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
