class ChelovekSImenem {
    // Поля класса: имя (объект типа Imena) и рост (целое число)
    private Imena name;
    private int height;

    // Конструктор класса ChelovekSImenem, который принимает имя и рост
    public ChelovekSImenem(Imena name, int height) {
        this.name = name;       // Инициализация поля name переданным значением
        this.height = height;   // Инициализация поля height переданным значением
    }

    // Переопределение метода toString для удобного представления объекта в виде строки
    @Override
    public String toString() {
        return name + ", рост: " + height; // Возвращает строку с именем и ростом
    }

    // Статический метод run для создания и вывода объектов класса ChelovekSImenem
    public static void run() {
        // Создание объектов Imena с различными значениями
        Imena cleopatra = new Imena(null, "Клеопатра", null); // Клеопатра без фамилии и отчества
        Imena pushkin = new Imena("Пушкин", "Александр", "Сергеевич"); // Пушкин с фамилией, именем и отчеством
        Imena mayakovsky = new Imena("Маяковский", "Владимир", null); // Маяковский с фамилией и именем, без отчества

        // Создание объектов ChelovekSImenem с заданными именами и ростом
        ChelovekSImenem person1 = new ChelovekSImenem(cleopatra, 152);
        ChelovekSImenem person2 = new ChelovekSImenem(pushkin, 167);
        ChelovekSImenem person3 = new ChelovekSImenem(mayakovsky, 189);


        System.out.println(person1); //  "Клеопатра, рост: 152"
        System.out.println(person2); //  "Пушкин, рост: 167"
        System.out.println(person3); //  "Маяковский, рост: 189"
    }
}
