package Homework5;

import java.util.Random;

public class Array {

    public static void main(String[] args) {
        int[] array = new int[14];
        Random rnd = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(80);

            System.out.print(array[i] + " ");
        }

        int min = array[0];
        for (int value : array) {
            if (min > value) {
                min = value;
            }
        }
        System.out.println();
        System.out.println("Минимальное значение массива " + min);

        int max = array[0];
        for (int k : array) {
            if (max < k) {
                max = k;

            }
        }
        System.out.println();
        System.out.println("Максимальное значение массива " + max);

        double average = 0;
        for (int j : array) {
            average += (double) j / array.length;
        }
        System.out.println();
        System.out.println("Среднее значение массива " + average);
    }
}
