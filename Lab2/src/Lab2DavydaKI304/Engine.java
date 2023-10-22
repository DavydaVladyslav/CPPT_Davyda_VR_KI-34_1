package Lab2DavydaKI304;

/**
 * Class representing a car engine.
 *
 * This class contains information about the car's engine, including its volume in liters
 * and the number of cylinders.
 */
public class Engine {
    private double volume; // Об'єм двигуна в літрах
    private int cylinders; // Кількість циліндрів

    /**
     * Конструктор за замовчуванням
     */
    public Engine() {
        volume = 0.0;
        cylinders = 0;
    }

    /**
     * Конструктор з параметрами
     *
     * @param volume    Об'єм двигуна в літрах
     * @param cylinders Кількість циліндрів
     */
    public Engine(double volume, int cylinders) {
        this.volume = volume;
        this.cylinders = cylinders;
    }

    /**
     * Метод для отримання об'єму двигуна
     *
     * @return Об'єм двигуна в літрах
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Метод для встановлення об'єму двигуна
     *
     * @param volume Новий об'єм двигуна в літрах
     */
    public void setVolume(double volume) {
        this.volume = volume;
    }

    /**
     * Метод для отримання кількості циліндрів
     *
     * @return Кількість циліндрів двигуна
     */
    public int getCylinders() {
        return cylinders;
    }

    /**
     * Метод для встановлення кількості циліндрів
     *
     * @param cylinders Нова кількість циліндрів двигуна
     */
    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
