// Определение класса chelovek (возможно, стоит использовать заглавную букву для имени класса)
class chelovek {
    // Поля класса: имя человека (строка) и рост (целое число)
    private String name;
    private int height;

    // Конструктор класса chelovek, который принимает имя и рост
    public chelovek(String name, int height) {
        this.name = name;       // Инициализация поля name переданным значением
        this.height = height;   // Инициализация поля height переданным значением
    }

    // Переопределение метода toString для удобного представления объекта в виде строки
    @Override
    public String toString() {
        return name + ", рост: " + height; // Возвращает строку с именем и ростом
    }

    // Статический метод run для создания и вывода объектов класса chelovek
    public static void run() {
        // Создание объектов класса chelovek с заданными именем и ростом
        chelovek cleopatra = new chelovek("Клеопатра", 152);
        chelovek pushkin = new chelovek("Пушкин", 167);
        chelovek vladimir = new chelovek("Владимир", 189);

        System.out.println(cleopatra);
        System.out.println(pushkin);
        System.out.println(vladimir);
    }
}
