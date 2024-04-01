package Lesson11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Введите целые положительные числа(для завершения введите отрицательное число");

        while (true) {
            System.out.print("Введите число: ");
            String input = scanner.nextLine();

            if (input.matches("-?\\d+")) {

                int number = Integer.parseInt(input);
                if (number < 0) {
                    break;
                } else {
                    numbers.add(number);
                }
            } else {
                System.out.println("Ошибка: Введите целое число.");
            }
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        System.out.println("Сумма введенных чисел: " + sum);

    }
}
