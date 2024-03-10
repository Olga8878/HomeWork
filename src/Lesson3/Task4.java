package Lesson3;

import java.util.Arrays;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int n = 0;

        while (n < 5) {
            if (sc.hasNext()) {
                n = sc.nextInt();
                if (n < 5) {
                    System.out.println("Введенное число должно быть больше 5.Повторите ввод.");
                }
                if (n >= 10) {
                    System.out.println("Введенное число должно быть меньше или равно 10.Повторите ввод");
                    sc.next();
                }


                int[] m1 = new int[n];
                int nums = 0;

                for (int i = 0; i < n; i++) {
                    m1[i] = (int) (Math.random() * (n + 1));

                    if (m1[i] % 2 == 0) ;
                    {
                        nums++;
                    }
                }
                System.out.println(Arrays.toString(m1));
                int[] m2 = new int[nums];
                int c = 0;
                for (int i = 0; i < n; i++) {
                    if (m1[i] % 2 == 0) {
                        m2[c] = m1[i];
                        c++;
                    }
                }
                System.out.println(Arrays.toString(m2));
            }
        }
    }
}
