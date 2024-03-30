package Lesson10;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println("Введи номер слова:");
        int word = scanner.nextInt();

        String[] words = input.split("\\s+");

        if (word > 0 & word <= words.length) {
            String selectedWord = words[word - 1];
            String reversedWord1 = new StringBuilder(selectedWord).reverse().toString();

            if (selectedWord.equalsIgnoreCase(reversedWord1)) {
                System.out.println("Слово " + selectedWord + "  является палиндромом.");
            } else {
                System.out.println("Слово " + selectedWord + " не является палиндромом.");
            }
        } else {
            System.out.println("Некорректный номер слова.");
        }
    }
}

