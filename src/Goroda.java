import java.util.ArrayList; // Импортируем класс ArrayList для использования динамического массива
import java.util.List; // Импортируем интерфейс List для работы с коллекциями

// Определяем класс Goroda для представления городов
public class Goroda {
    private String name; // Название города
    private List<Path> paths; // Список путей к другим городам

    // Конструктор для инициализации города с заданным именем
    public Goroda(String name) {
        this.name = name; // Присваиваем имя города
        this.paths = new ArrayList<>(); // Инициализируем список путей
    }

    // Метод для добавления пути к другому городу с указанием стоимости
    public void addPath(Goroda destination, int cost) {
        paths.add(new Path(destination, cost)); // Добавляем новый путь в список
    }

    // Переопределение метода toString для удобного представления информации о городе
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(name + ": "); // Начинаем строку с названия города
        for (Path path : paths) { // Проходим по всем путям
            result.append(path.getDestination().getName()) // Добавляем название города назначения
                    .append(":") // Добавляем двоеточие
                    .append(path.getCost()) // Добавляем стоимость пути
                    .append(" "); // Добавляем пробел
        }
        return result.toString().trim(); // Возвращаем строку без лишнего пробела в конце
    }

    // Метод для получения названия города
    public String getName() {
        return name; // Возвращаем имя города
    }

    // Вложенный класс для представления пути к другому городу
    private static class Path {
        private Goroda destination; // Город назначения
        private int cost; // Стоимость пути

        // Конструктор для инициализации пути с указанием города назначения и стоимости
        public Path(Goroda destination, int cost) {
            this.destination = destination; // Присваиваем город назначения
            this.cost = cost; // Присваиваем стоимость пути
        }

        // Метод для получения города назначения
        public Goroda getDestination() {
            return destination; // Возвращаем город назначения
        }

        // Метод для получения стоимости пути
        public int getCost() {
            return cost; // Возвращаем стоимость
        }
    }

    // Статический метод для запуска примера использования класса Goroda
    public static void run() {
        // Создаем экземпляры городов
        Goroda A = new Goroda("A"); // Город A
        Goroda B = new Goroda("B"); // Город B
        Goroda C = new Goroda("C"); // Город C
        Goroda D = new Goroda("D"); // Город D
        Goroda E = new Goroda("E"); // Город E
        Goroda F = new Goroda("F"); // Город F

        // Добавляем пути между городами с указанием стоимости
        A.addPath(B, 5);
        A.addPath(F, 1);
        A.addPath(D, 6);

        B.addPath(C, 3);
        B.addPath(A, 5);

        C.addPath(B, 3);
        C.addPath(D, 4);

        D.addPath(A, 6);
        D.addPath(C, 4);
        D.addPath(E, 2);

        E.addPath(F, 2);

        F.addPath(B, 1);
        F.addPath(E, 2); // Путь от F до E стоит 2

        // Выводим информацию о каждом городе
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
