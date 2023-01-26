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
    }

    public void insert(int index, int newValue) {
        if(index>=0&&index<array.length) {
            int[] newArray = Arrays.copyOf(array, array.length + 1);

            for (int oldArrayIndex = 0; oldArrayIndex < array.length; oldArrayIndex++) {
                if (oldArrayIndex < index) {
                    newArray[oldArrayIndex] = array[oldArrayIndex];
                } else if (oldArrayIndex == index) {
                    newArray[index] = newValue;
                } else if (oldArrayIndex > index) {
                    newArray[oldArrayIndex + 1] = array[oldArrayIndex];
                }
            }
            array = Arrays.copyOf(newArray, newArray.length);
        } else if (index>=array.length) {
            add(newValue);
        }else
        {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
}
