# truck.py
from vehicle import Vehicle

class Truck(Vehicle):
    def __init__(self, make, model, year, max_load):
        # Конструктор класу "Вантажний автомобіль"
        super().__init__(make, model, year)
        self.__max_load = max_load  # Максимальна вантажопідйомність в кілограмах.
        self.__current_load = 0  # Початковий стан: вантаж не завантажено.

    def load(self, weight):
        # Метод load завантажує вантаж у вантажний автомобіль, якщо це можливо.
        if self.__current_load + weight <= self.__max_load:
            self.__current_load += weight
            print(f"Завантажено {weight} кг у вантажівку.")
        else:
            print("Не можна завантажити більше, вантажний автомобіль на максимальній потужності.")

    def unload(self, weight):
        # Метод unload розвантажує вантаж з вантажного автомобіля, якщо це можливо.
        if self.__current_load - weight >= 0:
            self.__current_load -= weight
            print(f"Вивантажено {weight} кг з вантажівки.")
        else:
            print("Не вдалося вивантажити більше, ніж вже завантажено.")

    def get_load(self):
        # Метод get_load повертає поточну кількість завантаженого вантажу.
        return self.__current_load

    def get_max_load(self):
        # Метод, що повертає максимальну вантажопідйомність вантажного автомобіля.
        return self.__max_load

    def __str__(self):
        # Метод __str__ повертає рядок, який представляє вантажний автомобіль.
        return f"{self.get_year()} {self.get_make()} {self.get_model()} (Max Load: {self.get_max_load()} kg)"