package Lessons;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму вклада");
        float sum = sc.nextFloat();
        System.out.println("Введите количество месяцев вклада");
        int month = sc.nextInt();

        for (int i = 1; i <= month; i++) {
            sum += (float) (sum * 0.07);
            System.out.println("Сумма процентов за каждый месяц:" + sum);


        }
    }
}
