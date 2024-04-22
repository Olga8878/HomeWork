package Lesson10;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        StringBuilder duplicatedStr = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char enteredString = input.charAt(i);
            duplicatedStr.append(enteredString).append(enteredString);
        }

        System.out.println(duplicatedStr);
    }
}

