package Lab6DavydaKI304;

/**
 * Class for demonstrating the usage of the DoublyLinkedList class.
 */
public class DoublyLinkedListApp {
    public static void main(String[] args) {
        // Створюємо два екземпляри класів для розміщення у контейнері DoublyLinkedList
        DoublyLinkedList<Integer> integerList = new DoublyLinkedList<>();


        // Додаємо елементи до списку integerList
        integerList.addToFront(10);
        integerList.addToFront(20);
        integerList.addToEnd(30);

        // Виводимо максимальний елемент зі списку integerList
        System.out.println("Максимальний елемент в : " + integerList.getMax());



        // Перевіримо, чи залишилися елементи у списку після видалення
        System.out.println("Чи порожній  " + integerList.isEmpty());

        // Видалимо елементи з кінця списку integerList
        System.out.println("Видалено з кінця : " + integerList.removeFromEnd());
        System.out.println("Видалено з кінця : " + integerList.removeFromEnd());




        DoublyLinkedList<String> stringList = new DoublyLinkedList<>();


        // Додаємо елементи до списку stringList
        stringList.addToFront("a");
        stringList.addToEnd("b");
        stringList.addToEnd("c");

        // Виводимо максимальний елемент зі списку stringList
        System.out.println("Максимальний елемент  : " + stringList.getMax());

        // Виведемо інші характеристики списків
        System.out.println("Розмір : " + stringList.size());
        System.out.println("Чи порожній stringList? " + stringList.isEmpty());


        // Видалимо елементи з кінця списку stringList
        System.out.println("Видалено з кінця stringList: " + stringList.removeFromEnd());
        System.out.println("Видалено з кінця stringList: " + stringList.removeFromEnd());
        System.out.println("Видалено з кінця stringList: " + stringList.removeFromEnd());

        // Перевіримо, чи залишилися елементи у списку після видалення
        System.out.println("Чи порожній stringList? " + stringList.isEmpty());
    }
}
