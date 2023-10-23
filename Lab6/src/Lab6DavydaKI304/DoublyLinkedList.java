package Lab6DavydaKI304;

import java.util.EmptyStackException;

/**
 * Implementation of a generic doubly linked list.
 *
 * @param <T> The type of elements stored in the list.
 */
public class DoublyLinkedList<T extends Comparable<T>> {
    private Node<T> head; // Початок списку
    private Node<T> tail; // Кінець списку
    private int size;     // Кількість елементів у списку

    /**
     * Конструктор для створення порожнього двозв'язного списку.
     */
    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Додає елемент на початок списку.
     *
     * @param data Елемент, який додається до списку.
     */
    public void addToFront(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    /**
     * Додає елемент в кінець списку.
     *
     * @param data Елемент, який додається до списку.
     */
    public void addToEnd(T data) {
        Node<T> newNode = new Node<>(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    /**
     * Видаляю та повертаю елемент з початку списку.
     *
     * @return Елемент, видалений з початку списку.
     * @throws EmptyStackException якщо список порожній.
     */
    public T removeFromFront() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        size--;
        return data;
    }

    /**
     * Видаляю та повертаю елемент з кінця списку.
     *
     * @return Елемент, видалений з кінця списку.
     * @throws EmptyStackException якщо список порожній.
     */
    public T removeFromEnd() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = tail.data;
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null;
        }
        size--;
        return data;
    }

    /**
     * Перевіряю, чи список порожній.
     *
     * @return true, якщо список порожній, false в іншому випадку.
     */
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Повертаю кількість елементів у списку.
     *
     * @return Кількість елементів у списку.
     */
    public int size() {
        return size;
    }

    /**
     * Повертаю максимальний елемент у списку, перебираючи всі елементи.
     *
     * @return Максимальний елемент у списку.
     * @throws EmptyStackException якщо список порожній.
     */
    public T getMax() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Node<T> current = head;
        T maxElement = current.data;
        while (current != null) {
            if (current.data.compareTo(maxElement) > 0) {
                maxElement = current.data;
            }
            current = current.next;
        }
        return maxElement;
    }

    /**
     * Приватний внутрішній клас, що представляє вузол в двозв'язному списку.
     *
     * @param <T> Тип даних, збережених у вузлі.
     */
    private static class Node<T> {
        private final T data;    // Дані вузла
        private Node<T> prev;    // Попередній вузол
        private Node<T> next;    // Наступний вузол

        public Node(T data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }
}
