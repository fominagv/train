package lesson_04.examples.first;

/**
 * Created by galina on 3/13/16.
 */
// Класс Child наследуется от класса Parent,
// но имеет ограничение доступа по умолчанию
class Child extends Parent {
}

//К методу getValue() класса Provider можно обратиться и из другого пакета, не только из пакета first, поскольку метод объявлен как public.
// Данный метод возвращает экземпляр класса Child, который недоступен из других пакетов.
public class Provider {
    public Parent getValue() {
        return new Child();
    }
}
