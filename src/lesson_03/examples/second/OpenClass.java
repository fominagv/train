package lesson_03.examples.second;

/**
 * Created by galina on 3/9/16.
 */


/*
Объявления верхнего уровня описывают классы и интерфейсы, хранящиеся в пакетах.
Inner типы  - объявляются внутри других типов и являются их элементами наряду с полями и методами.
Существует ограничение которое создает ошибку компиляции в случае, если описание типа не обнаруживается в файле с названием,
составленным из имени типа и расширения (например, java ), и при этом:
- тип объявлен как public и, значит, может использоваться из других пакетов;
- тип используется из других модулей компиляции в своем пакете.
В модуле компиляции может быть максимум один public тип, и его имя и имя файла должны совпадать.

 */
public class OpenClass {
    public class InnerPublicClass{}

}
//public class PublicClass{}

class PackageClass{}

