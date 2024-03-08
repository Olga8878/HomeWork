package Lessons;

import java.util.Scanner;

import static java.lang.System.in;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Введи температуру");
        int t = sc.nextInt();
        if (t > -5) {
            System.out.println("Тепло");
        } else if (t > -20) {
            System.out.println("Нормально");
        } else {
            System.out.println("Холодно");

        }
    }
}

