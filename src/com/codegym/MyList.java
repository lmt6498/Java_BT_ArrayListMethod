package com.codegym;

import javax.management.ObjectName;
import java.util.Arrays;

public class MyList<E> implements Cloneable {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + capacity);
        }
    }

    private void ensureCapacity(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        System.arraycopy(elements, index, elements, index + 1, elements.length - 1 - index);
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        for (; index < elements.length - 1; index++) {
            elements[index] = elements[index + 1];
        }
        return (E) elements;
    }

    public int size() {
        return this.size;
    }

    public E clone() {
        return (E) clone();
    }
    public boolean contains(E o) {
        return  indexOf(o) >=0;
    }

    public int indexOf(E o){
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }
    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(1);
        }
        elements[size++] = e;
        return true;
    }

    public E get (int index) {
        if (index<0 || index >= size) {
            throw new IndexOutOfBoundsException(index);
        }
        return (E) elements[index];
    }

    public void clear() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
