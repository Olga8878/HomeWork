package Lesson10;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        StringBuilder duplicatedStr = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char Char1 = input.charAt(i);
            duplicatedStr.append(Char1).append(Char1);
        }

        System.out.println(duplicatedStr);
    }
}

