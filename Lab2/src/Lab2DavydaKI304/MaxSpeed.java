package Lab2DavydaKI304;

/**
 * Class representing the maximum speed of a car.
 *
 * This class stores information about the maximum speed that a car can achieve.
 */
public class MaxSpeed {
    private int speed;

    /**
     * Конструктор за замовчуванням
     */
    public MaxSpeed() {
        speed = 0;
    }

    /**
     * Конструктор з параметрами
     *
     * @param speed Максимальна швидкість машини в кілометрах на годину
     */
    public MaxSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Метод для отримання максимальної швидкості
     *
     * @return Максимальна швидкість машини в кілометрах на годину
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Метод для встановлення максимальної швидкості
     *
     * @param speed Нова максимальна швидкість машини в кілометрах на годину
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
