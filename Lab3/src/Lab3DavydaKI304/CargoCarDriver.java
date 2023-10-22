package Lab3DavydaKI304;

import java.io.FileNotFoundException;

/**
 * A driver class for testing cargo cars (CargoCar).
 *
 * This class serves as a driver program for testing and demonstrating the functionality
 * of cargo cars and their cargo transportation capabilities.
 */
public class CargoCarDriver {
    /**
     * Головний метод, який виконує тестування вантажних машин.
     *
     * @param args Параметри командного рядка (не використовуються в цьому випадку).
     * @throws FileNotFoundException Виняток, який виникає, якщо файл логу не може бути створено.
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Створюємо об'єкт вантажної машини (CargoCar)
        CargoCar myCargoCar = new CargoCar("Volvo", "VNL", 2022, 30000.0);

        // Виводимо початкову інформацію про вантажну машину
        System.out.println("Початкова інформація про вантажну машину:\n" + myCargoCar.getFullInfo());

        // Змінюємо колір машини
        myCargoCar.setColor("Чорний");

        // Завантажуємо вантаж на машину та додаємо коментар до логу
        myCargoCar.loadCargo(5000);
        myCargoCar.addLogComment("Завантажено 6000 кг вантажу");

        // Розвантажуємо частину вантажу з машини та додаємо коментар до логу
        myCargoCar.unloadCargo(300);
        myCargoCar.addLogComment("Розвантажено 2000 кг вантажу");

        // Виводимо оновлену інформацію про вантажну машину
        System.out.println("\nІнформація про вантажну машину після завантаження та розвантаження:\n" + myCargoCar.getFullInfo());
        System.out.println("Загальна вага вантажу на борту: " + myCargoCar.getCargoWeight());
        System.out.println("Колір машини: " + myCargoCar.getColor());
        // Закриваємо файл логу
        myCargoCar.closeLogFile();
    }
}
