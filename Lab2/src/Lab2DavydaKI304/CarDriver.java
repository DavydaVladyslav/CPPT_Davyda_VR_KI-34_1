package Lab2DavydaKI304;

import java.io.FileNotFoundException;


/**
 * The CarDriver class serves as a driver for testing the "Car" class, "MaxSpeed" class, and "Engine" class.
 * In this class, we create instances of these classes, modify their properties, and display information.
 */
class CarDriver {
    public static void main(String[] args) throws FileNotFoundException {
        // Створюємо об'єкт класу "Максимальна швидкість"
        MaxSpeed maxSpeed = new MaxSpeed(200);

        // Створюємо об'єкт класу "Двигун"
        Engine engine = new Engine(2.0, 4);

        // Створюємо об'єкт класу "Машина"
        Car myCar = new Car("Toyota", "Camry", 2022, 35000.0, maxSpeed, engine);

        // Виводимо початкову інформацію про машину, максимальну швидкість та двигун
        System.out.println("Початкова інформація про машину:\n" + myCar.getFullInfo());
        System.out.println("Максимальна швидкість: " + maxSpeed.getSpeed() + " км/год");
        System.out.println("Двигун: Об'єм - " + engine.getVolume() + " л, Кількість циліндрів - " + engine.getCylinders());
        System.out.println("Колір машини: " + myCar.getColor());
        // Змінюємо ціну машини та додаємо коментар до логу
        myCar.setPrice(25000.0);
        myCar.addLogComment("Змінено ціну на 25000.0");

        // Змінюємо колір машини
        myCar.setColor("Червоний");

        // Змінюємо максимальну швидкість та об'єм двигуна
        maxSpeed.setSpeed(220);
        engine.setVolume(2.5);

        // Виводимо оновлену інформацію про машину, максимальну швидкість та двигун
        System.out.println("\nОновлена інформація про машину:\n" + myCar.getFullInfo());
        System.out.println("Максимальна швидкість: " + maxSpeed.getSpeed() + " км/год");
        System.out.println("Двигун: Об'єм - " + engine.getVolume() + " л, Кількість циліндрів - " + engine.getCylinders());
        System.out.println("Колір машини: " + myCar.getColor());

        // Закриваємо файл логу
        myCar.closeLogFile();
    }
}
