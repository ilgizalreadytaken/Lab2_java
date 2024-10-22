import java.util.Scanner;

public class Main { // Главный класс, с которого начинается выполнение программы
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаем объект Scanner для ввода данных
        boolean exit = false; // Флаг для выхода из программы

        // Создаем кота с именем "Барсик"
        kot_myaukaet barsik = new kot_myaukaet("Барсик");

        while (!exit) { // Цикл, который будет выполняться до тех пор, пока не будет установлен флаг exit
            System.out.println("Выберите задание:");
            System.out.println("1. Человек");
            System.out.println("2. Имя (1.3 или 4.5)");
            System.out.println("3. Человек с именем");
            System.out.println("4. Человек с именем и отцом (2.3 или 4.6)");
            System.out.println("5. Города и пути");
            System.out.println("6. Кот \"Барсик\" (помяукать)");
            System.out.println("7. Выйти");

            System.out.print("Выберете номер задания: ");

            // Обработка некорректного ввода
            // Проверяем, ввели ли мы целое число
            if (scanner.hasNextInt()) {
                int choice = scanner.nextInt(); // Считываем выбранный номер задания
                scanner.nextLine();  // Считываем перенос строки после ввода числа

                switch (choice) { // Проверяем, какой номер задания был введен
                    case 1:
                        chelovek.run();
                        break;
                    case 2:
                        System.out.println("Выберите версию вывода имен:");
                        System.out.println("1. Имена с задания 1.3");
                        System.out.println("2. Имена с задания 4.5");

                        // Проверяем, ввели ли мы целое число
                        if (scanner.hasNextInt()) {
                            int imenaChoice = scanner.nextInt(); // Считываем выбор версии имен
                            if (imenaChoice == 1) {
                                Imena.run(2);
                            } else if (imenaChoice == 2) {
                                Imena.run(6);
                            } else {
                                System.out.println("Неверный выбор. Возврат в меню.");
                            }
                        } else {
                            System.out.println("Неверный ввод. Возврат в меню.");
                            scanner.nextLine();
                        }
                        break;
                    case 3:
                        ChelovekSImenem.run();
                        break;
                    case 4:
                        System.out.println("Выберите вариант вывода:");
                        System.out.println("1. Задача 2.3");
                        System.out.println("2. Задача 4.6");

                        // Проверяем, ввели ли мы целое число
                        if (scanner.hasNextInt()) {
                            int exampleChoice = scanner.nextInt(); // Считываем выбор варианта вывода
                            if (exampleChoice == 1) {
                                ChelovekSImenemSotcom.run(4); // Вызываем первый пример
                            } else if (exampleChoice == 2) {
                                ChelovekSImenemSotcom.run(6); // Вызываем второй пример
                            } else {
                                System.out.println("Неверный выбор. Возврат в меню.");
                            }
                        } else {
                            System.out.println("Неверный ввод. Возврат в меню.");
                            scanner.nextLine();
                        }
                        break;
                    case 5:
                        Goroda.run();
                        break;
                    case 6:
                        barsik.myaukat();
                        barsik.myaukat(3);
                        break;
                    case 7:
                        exit = true;  // Устанавливаем флаг для выхода из программы
                        break;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова."); // Сообщение об ошибке
                }
            } else {
                System.out.println("Неверный ввод. Пожалуйста, введите целое число."); // Сообщение об ошибке
                scanner.nextLine();
            }
        }
        System.out.println("Программа завершена.");
        scanner.close();
    }
}
