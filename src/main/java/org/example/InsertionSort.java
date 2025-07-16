package org.example;

import java.util.Arrays;

public class InsertionSort extends Thread {
    private final int[] array;

    @Override
    public void run() {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;

        }
        System.out.println("Сортировка вставками: " + Arrays.toString(array));
    }

    public InsertionSort(int[] array) {
        this.array = array;
    }
}
