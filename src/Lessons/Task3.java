package Lessons;

import java.util.Scanner;

import static java.lang.System.in;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(in);
        System.out.println("Введи число");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Четное");
        } else {
            System.out.println("Нечетное");
        }
    }
}

