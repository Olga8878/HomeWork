package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {

        int[] array1 = new int[5];
        int[] array2 = new int[5];

        for (int i = 0; i < array1.length; i++) {
            Random r = new Random();
            array1[i] = r.nextInt(5);
            array2[i] = r.nextInt(5);

        }
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        int a = 0;
        int b = 0;

        for (int i = 0; i < array1.length; i++) {
            a += array1[i];
            b += array2[i];
        }
        System.out.print(a + "\n" + b);
        System.out.println();
        {
            {

                if (a > b)
                    System.out.println("Первый массив больше");
                else if (a == b)
                    System.out.println("Сумма обоих массивов равна");
                else
                    System.out.println("Второй массив больше");

            }
        }
    }
}


