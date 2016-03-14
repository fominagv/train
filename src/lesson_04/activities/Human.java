package lesson_04.activities;

/**
 * Created by galina on 3/13/16.
 */
//Перепешите класс Human так, чтобы поле age стало типа double, метод public int getAge() возвращал корректное значение
// И добавте новые get и set методы для работы с типом double.
//И чтобы у пользователей класса Human небыло прямого доступа для изменения возраста.
//И чтобы в поле age записывалтсь только положительные значения.


public class Human {
    public int age;
    // метод, возвращающий значение age
    public int getAge() {
        return age;
    }
    // метод, устанавливающий значение age
    public void setAge(int a) {
        age=a;
    }
}
