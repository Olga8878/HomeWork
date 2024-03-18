package Lesson7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Shapes[] sh = new Shapes[5];

        for (int i = 0; i < 5; i++) {

            System.out.println("Выберите номер фигуры (1 - Прямоугольник, 2 - Квадрат, 3 - Круг):");
            int number = scanner.nextInt();

            if (number == 1) {
                System.out.print("Введите ширину прямоугольника: ");
                double width = scanner.nextDouble();
                System.out.print("Введите высоту прямоугольника: ");
                double height = scanner.nextDouble();
                sh[i] = new Rectangle(width, height);

            } else if (number == 2) {
                System.out.print("Введите сторону квадрата: ");
                double side = scanner.nextDouble();
                sh[i] = new Square(side);

            } else if (number == 3) {
                System.out.print("Введите радиус круга: ");
                double radius = scanner.nextDouble();
                sh[i] = new Circle(radius);
            }
        }

        double totalPerimeter = 0.0;
        for (Shapes shapes : sh) {
            totalPerimeter += shapes.calculatePerimeter();

        }
        System.out.println("Сумма периметров всех фигур в массиве: " + totalPerimeter);
    }
}





