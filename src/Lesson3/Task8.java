package Lesson3;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность массива N*M");
        int n = 0, m = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            m = sc.nextInt();
        }
        int[][] mas = new int[n][m];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mas[i][j] = random.nextInt(5);
                System.out.print(mas[i][j] + " ");
            }

        }
        for (int[] i : mas) {
            Arrays.sort(i);
            System.out.println();
            for (int j : i) {

                System.out.print(" " + j + " ");
            }
        }
    }
}

