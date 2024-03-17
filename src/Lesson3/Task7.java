package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class Task7 {
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

        int summ = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                summ += mas[i][j];
            }
            System.out.println();
        }
        System.out.print("Сумма элементов массива " + summ);
    }
}




