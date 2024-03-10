package Lesson3;

import java.util.Scanner;

public class Task {
    public static void main(String args[]) {
        int i, num, num1;


        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        num = sc.nextInt();

        int []array= new int[num];

        System.out.println("Введите " + num + " чисел");

        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введите число, которое надо найти: ");
        num1 = sc.nextInt();

        for (i = 0; i < num; i++) {
            if (array[i] == num1) {
                System.out.println("Такое число есть в массиве");
                break;
            }
        }
        if (i == num) {
            System.out.println("Число " + num1 + " не найдено в массиве");
        }
    }
}
