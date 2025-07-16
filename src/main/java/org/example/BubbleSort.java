package org.example;

import java.util.Arrays;

public class BubbleSort extends Thread{
    private final int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        boolean swapped;
        for (int i = 0; i < array.length - 1; i++) {
            swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if( array[j] > array[j + 1]){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }


            }
            if (!swapped) break;
        }
        System.out.println("Сортировка пузырьком: " + Arrays.toString(array));
    }
}
