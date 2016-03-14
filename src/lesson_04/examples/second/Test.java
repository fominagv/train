package lesson_04.examples.second;

/**
 * Created by galina on 3/13/16.
 */
import lesson_04.examples.first.*;

public class Test {
    public static void main(String s[])
    {
        Provider pr = new Provider();
        Parent p = pr.getValue();
        System.out.println(p.getClass().getName()); //Результат -- first.Child
        // (Child)p - приведет к ошибке компиляции!
    }
}

//В классе Test работа идет с экземпляром недоступного класса Child, что возможно, поскольку обращение к нему делается через открытый класс Parent.
//Попытка же выполнить явное приведение вызовет ошибку. Тип объекта Child, но доступ к закрытому типу всегда запрещен.