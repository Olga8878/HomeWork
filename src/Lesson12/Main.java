package Lesson12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Library libraryApp = new Library();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выбери:");
            System.out.println("1. Добавить книгу");
            System.out.println("2. Взять книгу");
            System.out.println("3. Получить информацию о книге");
            System.out.println("4. Получить книги по автору");
            System.out.println("5. Получить всех авторов");
            System.out.println("6. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Введи имя автора:");
                    String author = scanner.nextLine();
                    System.out.println("Введи название книги:");
                    String title = scanner.nextLine();
                    System.out.println("Введи описание книги:");
                    String description = scanner.nextLine();
                    libraryApp.addBook(author, title, description);
                    break;
                case 2:
                    System.out.println("Введи имя автора:");
                    author = scanner.nextLine();
                    System.out.println("Введи название книги:");
                    title = scanner.nextLine();
                    libraryApp.takeBook(author, title);
                    break;
                case 3:
                    System.out.println("Введи имя автора:");
                    author = scanner.nextLine();
                    System.out.println("Введи название книги:");
                    title = scanner.nextLine();
                    libraryApp.getBookInfo(author, title);
                    break;
                case 4:
                    System.out.println("Введи имя автора:");
                    author = scanner.nextLine();
                    libraryApp.getBooksByAuthor(author);
                    break;
                case 5:
                    libraryApp.getAllAuthors();
                    break;
                case 6:
                    System.out.println("Выход");
                    System.exit(0);
                default:
                    System.out.println("Неверный выбор.Повторите попытку");
            }
        }
    }
}
