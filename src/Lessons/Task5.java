package Lessons;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи номер цвета радуги");
        int color = sc.nextInt();
        switch (color) {
            case 1:
                System.out.println("Красный");
                break;
            case 2:
                System.out.println("Оранжевый");
                break;
            case 3:
                System.out.println("Желтый");
                break;
            case 4:
                System.out.println("Зеленый");
                break;
            case 5:
                System.out.println("Голубой");
                break;
            case 6:
                System.out.println("Синий");
            case 7:
                System.out.println("Фиолетовый");
            default:
                System.out.println("Такого цвета нет");
        }
    }
}

