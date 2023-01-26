package com.codecool.dynamicarray;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class DynamicArray {

    private int capacity;
    private int[] array = new int[0];

    public DynamicArray(int capacity) {
        this.capacity = capacity;
    }

    public DynamicArray() {
        this(4);
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return array.length;
    }

    public void add(int value) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = value;
    }

    public int get(int index) {
        if (index < array.length && index >= 0){
            return array[index];
        } else {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void remove(int indexToBeRemoved) {
        int[] arrayCopy = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i == indexToBeRemoved) {
                continue;
            }
            arrayCopy[j++] = array[i];
        }
        array = arrayCopy;

    }

        public void insert(int index, int newValue) {
            if (index < array.length && index>=0) {
                array = Arrays.copyOf(array, array.length + 1);
                for (int i = array.length - 1; i > index; i--) {
                    array[i] = array[i - 1];
                }
                array[index] = newValue;
            } else if (index > array.length) {
                add(newValue);
            } else {
                throw new ArrayIndexOutOfBoundsException();
            }
            if (array.length > capacity) {
                capacity *= 2;
            }
        }
}
