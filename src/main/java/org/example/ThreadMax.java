package org.example;

public class ThreadMax extends Thread {
    private final int[] array;
    private int max;

    public ThreadMax(int[] array) {
        this.array = array;
    }

    public int getMax() {
        return max;
    }

    @Override
    public void run() {
        max = array[0];
        for (int num : array) {
            if (num > max){
                max = num;
            }
        }

    }
}
