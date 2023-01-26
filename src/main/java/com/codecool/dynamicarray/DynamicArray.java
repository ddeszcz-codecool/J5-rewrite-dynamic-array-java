package com.codecool.dynamicarray;

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
        return 0;
    }

    public void remove(int indexToBeRemoved) {
    }

    public void insert(int index, int newValue) {
    }
}
