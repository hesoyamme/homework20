package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количесво элементов массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] insertionArray = Arrays.copyOf(array, array.length);
        int[] selectionArray = Arrays.copyOf(array, array.length);
        int[] bubbleArray = Arrays.copyOf(array, array.length);

        Thread insertionThread = new InsertionSort(insertionArray);
        Thread selectionThread = new SelectionSort(selectionArray);
        Thread bubbleThread = new BubbleSort(bubbleArray);

        insertionThread.start();
        selectionThread.start();
        bubbleThread.start();

        try {
            insertionThread.join();
            selectionThread.join();
            bubbleThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Исходный массив: " + Arrays.toString(array));
    }
}
