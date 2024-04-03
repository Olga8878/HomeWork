package Lesson10;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();

        String[] words = input.split("\\s+");

        String shortestWord = words[0];
        String longestWord = words[0];

        for (String word : words) {
            if (word.length() < shortestWord.length()) {
                shortestWord = word;
            }
            if (word.length() >= longestWord.length()) {
                longestWord = word;
            }
        }

        String lastShortestWord = "";
        String lastLongestWord = "";

        for (String word : words) {
            if (word.length() == shortestWord.length()) {
                lastShortestWord = word;
            }
            if (word.length() == longestWord.length()) {
                lastLongestWord = word;
            }
        }

        System.out.println("Самое короткое слово: " + lastShortestWord);
        System.out.println("Самое длинное слово: " + lastLongestWord);
    }
}
