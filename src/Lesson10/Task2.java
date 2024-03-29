package Lesson10;

import java.util.Scanner;


public class Task2 {


   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        String minWord = null;
        int minChars = Integer.MAX_VALUE;

        for (String word : words) {
            int uniqueChars = countCharacters(word);
            if (uniqueChars < minChars) {
                minChars = uniqueChars;
                minWord = word;
            }
        }

        System.out.println("Слово с минимальным числом символов: " + minWord);
    }

    private static int countCharacters(String word) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }

        return sb.length();
    }
}

