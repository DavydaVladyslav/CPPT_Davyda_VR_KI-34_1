package Lab3DavydaKI304;

import java.io.FileNotFoundException;

/**
 * Subclass representing a cargo car.
 *
 * This subclass extends the abstract class Carr and implements the CargoTransport interface.
 * It represents a cargo car with additional features related to cargo transportation.
 */
public class CargoCar extends Carr implements CargoTransport {
    private int cargoWeight;

    /**
     * Конструктор з параметрами
     *
     * @param make  Марка машини
     * @param model Модель машини
     * @param year  Рік випуску машини
     * @param price Ціна машини
     * @throws FileNotFoundException
     */
    public CargoCar(String make, String model, int year, double price) throws FileNotFoundException {
        super(make, model, year, price);
        cargoWeight = 0;
    }
    /**
     * Метод `loadCargo` використовується для завантаження вантажу на борт об'єкта, що реалізує інтерфейс `CargoCarrier`.
     *
     * @param weight Вага вантажу, яку необхідно завантажити (в кілограмах).
     */
    @Override
    public void loadCargo(int weight) {
        cargoWeight += weight;
        addLogComment("Завантажено " + weight + " кг вантажу");
    }
    /**
     * Метод `unloadCargo` використовується для розвантаження вантажу з борту об'єкта, що реалізує інтерфейс `CargoCarrier`.
     *
     * @param weight Вага вантажу, яку необхідно розвантажити (в кілограмах).
     */
    @Override
    public void unloadCargo(int weight) {
        if (cargoWeight >= weight) {
            cargoWeight -= weight;
            addLogComment("Розвантажено " + weight + " кг вантажу");
        } else {
            addLogComment("Неможливо розвантажити " + weight + " кг вантажу, недостатньо вантажу на борту.");
        }
    }

    /**
     * Отримати вагу вантажу на борту
     *
     * @return Вага вантажу на борту
     */
    public int getCargoWeight() {
        return cargoWeight;
    }
}
