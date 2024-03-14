package Lesson3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int num = sc.nextInt();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10));
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int av = 0;
        int max = array[0];
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            av += array[i];
        }
        av /= array.length;


        System.out.println("Максимальное : " + max);
        System.out.println("Минимальное : " + min);
        System.out.println("Среднее : " + av);
    }
}


