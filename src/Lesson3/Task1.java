package Lesson3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        int[] m = new int[5];

        for (int i = 0; i < m.length; i++) {
            Random r = new Random();
            m[i] = r.nextInt(5);

        }
        for (int value : m) {
            System.out.print(value + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        System.out.println("Введи число");

        int number = sc.nextInt();

        int count = 0;
        int count2 = 0;

        for (int k : m) {
            if (number != k) {
                count++;
            } else {
                count2++;
            }
        }
        if (count2 == 0) {
            System.out.println("Ваше число не входит в массив");
        }

        int[] m2 = new int[count];

        for (int i = 0, j = 0; i < m2.length; i++) {
            if (number != m[i]) {
                m2[j] = m[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}

