package org.example;

public class ThreadMin extends Thread{
    private final int[] array;
    private int min;

    public ThreadMin(int[] array) {
        this.array = array;
    }

    public int getMin() {
        return min;
    }

    @Override
    public void run() {
        min = array[0];
        for (int num : array) {
            if (num < min){
                min = num;
            }
        }

    }
}
