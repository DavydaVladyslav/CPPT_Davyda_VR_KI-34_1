# vehicle.py

class Vehicle:
    def __init__(self, make, model, year):
        # Конструктор класу "Машина"
        self.__make = make
        self.__model = model
        self.__year = year
        self.__running = False  # Початковий стан: машина не запущена.
        self.__speed = 0  # Початкова швидкість: 0 км/год.

    def start(self):
        # Метод start запускає машину і встановлює running на True.
        self.__running = True
        self.__speed = 0  # Під час запуску машина рухається з нульовою швидкістю.
        print(f"{self.__make} {self.__model} почав рухатися.")

    def stop(self):
        # Метод stop зупиняє машину і встановлює running на False, а швидкість на 0.
        self.__running = False
        self.__speed = 0
        print(f"{self.__make} {self.__model} зупинився.")

    def is_running(self):
        # Метод is_running повертає True, якщо машина запущена, і False в іншому випадку.
        return self.__running

    def get_make(self):
        # Метод, що повертає марку машини.
        return self.__make

    def get_model(self):
        # Метод, що повертає модель машини.
        return self.__model

    def get_year(self):
        # Метод, що повертає рік виробництва машини.
        return self.__year

    def set_speed(self, speed):
        # Метод, що встановлює швидкість машини (км/год).
        if self.__running:
            self.__speed = speed
            print(f"{self.__make} {self.__model} рухається зі швидкістю {self.__speed} км/год.")
        else:
            print(f"{self.__make} {self.__model} не може рухатися - машина не запущена.")

    def get_speed(self):
        # Метод, що повертає поточну швидкість машини.
        return self.__speed