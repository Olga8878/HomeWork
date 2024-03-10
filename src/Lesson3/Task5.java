package Lesson3;

import java.util.Arrays;
import java.util.Random;


public class Task5 {
    public static void main(String[] args) {
        int n = 5;
        int[] m = new int[n];

        for (int i = 0; i < m.length; i++) {
            Random r = new Random();
            m[i] = r.nextInt(5);
        }
        System.out.println(Arrays.toString(m));

        for (int i = 0; i < m.length; i++) {
            if (i % 2 == 1) {
                m[i] = 0;
            }
        }
        System.out.println(Arrays.toString(m));
    }
}