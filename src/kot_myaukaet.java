// Определяем класс kot_myaukaet для представления кота
class kot_myaukaet {
    private String name; // Имя кота

    // Конструктор для создания кота с указанным именем
    public kot_myaukaet(String name) {
        this.name = name; // Присваиваем имя кота
    }

    // Переопределение метода toString для представления кота в строковом формате
    @Override
    public String toString() {
        return "кот: " + name; // Возвращаем строку с указанием "кот:" и именем кота
    }

    // Метод для мяуканья один раз
    public void myaukat() {
        System.out.println(name + ": мяу!");
    }

    // Метод для мяуканья N раз
    public void myaukat(int n) {
        StringBuilder myauString = new StringBuilder(name + ": "); // Создаем StringBuilder для формирования строки
        for (int i = 0; i < n; i++) { // Цикл для добавления "мяу" n раз
            myauString.append("мяу"); // Добавляем "мяу" к строке
            if (i < n - 1) { // Если это не последний раз
                myauString.append("-"); // Добавляем "-" между мяуканьями
            }
        }
        System.out.println(myauString + "!");
    }
}
