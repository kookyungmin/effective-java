package net.happykoo.effective.part2.item7;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack<T> {
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(T e) {
        ensureCapacity();
        elements[size++] = e;
    }

    public T pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }

        T el = (T) elements[--size];
        //명시적으로 참조 해제
        elements[size] = null;

        return el;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
