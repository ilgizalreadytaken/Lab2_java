class Imena {
    // Поля класса для хранения фамилии, имени и отчества
    private String lastName;
    private String firstName;
    private String middleName;

    // Конструктор с тремя параметрами (старый)
    // Используется для инициализации полей класса с фамилией, именем и отчеством
    public Imena(String lastName, String firstName, String middleName) {
        this.firstName = firstName;  // Инициализация имени
        this.lastName = lastName;    // Инициализация фамилии
        this.middleName = middleName; // Инициализация отчества
    }

    // Конструктор с тремя параметрами (новый)
    // Используется для инициализации полей класса с именем, фамилией и отчеством,
    // параметр newVersion не используется, но может указывать на различие в версии
    public Imena(String firstName, String lastName, String middleName, boolean newVersion) {
        this.firstName = firstName;  // Инициализация имени
        this.lastName = lastName;    // Инициализация фамилии
        this.middleName = middleName; // Инициализация отчества
    }

    // Конструктор с двумя параметрами (новый)
    // Позволяет создать объект с указанием только имени и фамилии, отчество будет равно null
    public Imena(String firstName, String lastName) {
        this(firstName, lastName, null, true); // Отчество не указано, передаем true для newVersion
    }

    // Конструктор с одним параметром (новый)
    // Позволяет создать объект только с указанием имени, фамилия и отчество будут равны null
    public Imena(String firstName) {
        this(firstName, null, null, true); // Фамилия и отчество не указаны
    }

    // Геттеры для доступа к полям
    public String getLastName() {
        return lastName; // Возвращает фамилию
    }

    public String getFirstName() {
        return firstName; // Возвращает имя
    }

    public String getMiddleName() {
        return middleName; // Возвращает отчество
    }

    // Строковое представление (старый формат для case 2)
    // Возвращает строку, содержащую фамилию, имя и отчество в старом формате
    public String toStringOld() {
        StringBuilder result = new StringBuilder(); // Создаем объект StringBuilder для формирования строки
        if (lastName != null) result.append(lastName).append(" "); // Добавляем фамилию, если она не null
        if (firstName != null) result.append(firstName).append(" "); // Добавляем имя, если оно не null
        if (middleName != null) result.append(middleName); // Добавляем отчество, если оно не null
        return result.toString().trim(); // Возвращаем сформированную строку, убирая лишние пробелы
    }

    // Строковое представление (новый формат для case 6)
    // Переопределяет метод toString() для нового формата представления
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(); // Создаем объект StringBuilder для формирования строки
        if (firstName != null) result.append(firstName).append(" "); // Добавляем имя, если оно не null
        if (middleName != null) result.append(middleName).append(" "); // Добавляем отчество, если оно не null
        if (lastName != null) result.append(lastName); // Добавляем фамилию, если она не null
        return result.toString().trim(); // Возвращаем сформированную строку, убирая лишние пробелы
    }

    // Метод для запуска примеров
    public static void run(int caseNumber) {
        if (caseNumber == 2) {
            // Старый формат (для case 2)
            // Создаем несколько объектов Imena с использованием старого формата
            Imena cleopatraOld = new Imena(null, "Клеопатра", null); // Фамилия не указана
            Imena pushkinOld = new Imena("Пушкин", "Александр", "Сергеевич"); // Полное имя с отчеством
            Imena mayakovskyOld = new Imena("Маяковский", "Владимир", null); // Отчество не указано

            // Выводим строковое представление объектов в старом формате
            System.out.println(cleopatraOld.toStringOld());
            System.out.println(pushkinOld.toStringOld());
            System.out.println(mayakovskyOld.toStringOld());

        } else if (caseNumber == 6) {
            // Новый формат (для case 6)
            // Создаем несколько объектов Imena с использованием нового формата
            Imena cleopatraNew = new Imena("Клеопатра"); // Только имя
            Imena pushkinNew = new Imena("Александр", "Пушкин", "Сергеевич", true); // Полное имя с отчеством
            Imena mayakovskyNew = new Imena("Владимир", "Маяковский", null, true); // Отчество не указано
            Imena christopherNew = new Imena("Христофор", "Бонифатьевич"); // Полное имя с отчеством

            // Выводим строковое представление объектов в новом формате
            System.out.println(cleopatraNew);
            System.out.println(pushkinNew);
            System.out.println(mayakovskyNew);
            System.out.println(christopherNew);
        }
    }
}
