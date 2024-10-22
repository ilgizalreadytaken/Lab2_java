// Определение класса ChelovekSImenemSotcom
class ChelovekSImenemSotcom {
    // Поля класса: имя (объект типа Imena), рост (целое число) и отец (объект того же класса)
    private Imena name;
    private int height;
    private ChelovekSImenemSotcom father;  // Отец данного человека, также объект ChelovekSImenemSotcom

    // Конструктор для создания Человека с именем (в виде строки) и ростом
    public ChelovekSImenemSotcom(String name, int height) {
        this.name = new Imena(name);                  // Личное имя, инициализация объекта Imena
        this.height = height;                          // Инициализация роста
    }

    // Конструктор для создания Человека с именем (в виде строки), ростом и отцом
    public ChelovekSImenemSotcom(String name, int height, ChelovekSImenemSotcom father) {
        this(name, height);                            // Вызов другого конструктора для инициализации имени и роста
        this.father = father;                         // Инициализация поля father

        // Присваиваем фамилию и отчество в зависимости от отца
        if (father != null) {                         // Проверка, существует ли отец
            this.name = new Imena(father.name.getLastName(), name, father.name.getFirstName() + "ович"); // Создание нового имени
        }
    }

    // Конструктор для создания Человека с именем (объект типа Imena) и ростом
    public ChelovekSImenemSotcom(Imena name, int height) {
        this.name = name;                             // Инициализация поля name
        this.height = height;                         // Инициализация роста
    }

    // Конструктор для создания Человека с именем (объект типа Imena), ростом и отцом
    public ChelovekSImenemSotcom(Imena name, int height, ChelovekSImenemSotcom father) {
        this(name, height);                          // Вызов другого конструктора для инициализации имени и роста
        this.father = father;                        // Инициализация поля father

        // Проверка на наличие фамилии и отчества в имени
        if (this.name.getLastName() == null && father != null) { // Если фамилия отсутствует
            this.name = new Imena(father.name.getLastName(), this.name.getFirstName(), father.name.getFirstName() + "ович"); // Присвоение фамилии и отчества
        } else if (this.name.getMiddleName() == null && father != null) { // Если отчество отсутствует
            this.name = new Imena(this.name.getLastName(), this.name.getFirstName(), father.name.getFirstName() + "ович"); // Присвоение отчества
        }
    }

    // Переопределение метода toString для удобного представления объекта в виде строки
    @Override
    public String toString() {
        return name + ", рост: " + height; // Возвращает строку с именем и ростом
    }

    // Статический метод run для создания и вывода объектов класса ChelovekSImenemSotcom в зависимости от переданного номера кейса
    public static void run(int caseNumber) {
        if (caseNumber == 4) { // Если выбран кейс 4
            // Создаем объекты для первого кейса
            Imena ivanName = new Imena("Чудов", "Иван", null); // Создаем имя Ивана
            ChelovekSImenemSotcom fatherIvan = new ChelovekSImenemSotcom(ivanName, 180, null); // Создаем отца Ивана
            Imena petrName = new Imena("Иванович", "Петр", null); // Создаем имя Петра
            ChelovekSImenemSotcom sonPetr = new ChelovekSImenemSotcom(petrName, 170, fatherIvan); // Создаем сына Петра
            Imena borisName = new Imena("Петрович", "Борис", null);
            ChelovekSImenemSotcom grandsonBoris = new ChelovekSImenemSotcom(borisName, 160, sonPetr); // Создаем внука Бориса


            System.out.println(fatherIvan);
            System.out.println(sonPetr);
            System.out.println(grandsonBoris);

        } else if (caseNumber == 6) { // Если выбран кейс 6
            // Создаем объекты для второго кейса
            ChelovekSImenemSotcom lev = new ChelovekSImenemSotcom("Лев", 170); // Создаем Льва
            Imena pushkinSergei = new Imena("Сергей", "Пушкин"); // Создаем имя Сергея Пушкина
            ChelovekSImenemSotcom pushkin = new ChelovekSImenemSotcom(pushkinSergei, 168, lev); // Создаем Пушкина, указывая отца
            ChelovekSImenemSotcom alexander = new ChelovekSImenemSotcom("Александр", 167, pushkin); // Создаем Александра, указывая отца

            System.out.println(lev);
            System.out.println(pushkin);
            System.out.println(alexander);
        }
    }
}
