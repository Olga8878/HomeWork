package Lesson11;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите целые числа (для завершения введите exit):");

        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();
                numbers.add(num);
            } else {
                String input = scanner.next();
                if (input.equals("exit")) {
                    break;
                }
            }
        }

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int num : numbers) {
            if (!uniqueNumbers.add(num)) {
                duplicateNumbers.add(num);
            }
        }

        numbers.removeAll(duplicateNumbers);

        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}


