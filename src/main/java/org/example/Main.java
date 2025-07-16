package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количесво элементов массива: ");
        int n = scanner.nextInt();
        int[] array = new int[n];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        ThreadMax threadMax = new ThreadMax(array);
        ThreadMin threadMin = new ThreadMin(array);

        threadMin.start();
        threadMax.start();
        try {
            threadMax.join();
            threadMin.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Min: " + threadMin.getMin());
        System.out.println("Max: " + threadMax.getMax());
    }
}