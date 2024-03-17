package Lesson3;

import java.util.Scanner;

public class Task {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
       int num = sc.nextInt();

        int[] array = new int[num];

        System.out.println("Введите " + num + " чисел");

        int i;
        for (i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Введите число, которое надо найти: ");
        int num1 = sc.nextInt();
        boolean flag = false;

        for (i = 0; i < num; i++) {
            if (array[i] == num1) {
                System.out.println("Такое число есть в массиве");
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("Число " + num1 + " не найдено в массиве");
        }
    }
}
