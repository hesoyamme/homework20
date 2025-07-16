package org.example;

import java.util.Arrays;

public class SelectionSort extends Thread{
    private final int[] array;

    public SelectionSort(int[] array){
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]){
                    min = j;
                }

            }
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;

        }
        System.out.println("Сортировка выбором: " + Arrays.toString(array));
    }
}
