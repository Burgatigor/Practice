package Homework4;

import java.util.Scanner;

public class Fibo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер элемента последовательности числа Фибоначи");
        int n = scanner.nextInt();

        int a = 1, b = 1;
        System.out.print(a + " " + b);

        int fibo = 2, i = 2;
        while (i < n) {
            fibo = a + b;
            a = b;
            b = fibo;
            System.out.print(" " + fibo);
            i++;
        }
    }
}


