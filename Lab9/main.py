# main.py
from vehicle import Vehicle
from truck import Truck

def main():
    # Створення об'єктів "Транспортний засіб" і "Вантажний автомобіль".
    car = Vehicle("Toyota", "Camry", 2022)
    truck = Truck("Ford", "F150", 2021, max_load=5000)

    car.start()  # Запуск автомобіля.
    truck.start()  # Запуск вантажного автомобіля.

    print(f"Транспортний засіб працює? {car.is_running()}")
    print(f"Вантажний автомобіль працює? {truck.is_running()}")

    truck.load(3000)  # Завантаження 3000 кг вантажу.
    print(f"Поточне завантаження вантажного автомобіля: {truck.get_load()} кг")

    truck.unload(1500)  # Розвантаження 1500 кг вантажу.
    print(f"Поточне завантаження вантажного автомобіля: {truck.get_load()} кг")

    car.set_speed(60)  # Встановлення швидкості автомобіля.
    truck.set_speed(80)  # Встановлення швидкості вантажного автомобіля.

    print(f"Поточна швидкість автомобіля: {car.get_speed()} км/год")
    print(f"Поточна швидкість вантажного автомобіля: {truck.get_speed()} км/год")

    car.stop()  # Зупинка автомобіля.
    truck.stop()  # Зупинка вантажного автомобіля.

if __name__ == "__main__":
    main()
