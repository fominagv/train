package lesson_06.examples;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Created by galina on 3/31/16.
 */
public class DemoListMethods {
    public static void main(String[] args) {
        ArrayList<Character> a =
                new ArrayList<Character>(5);
        System.out.println("коллекция пуста: "
                + a.isEmpty());
        for (char c = 'a'; c < 'h'; ++c) { a.add(c);
        }
        char ch = 'a';
        a.add(6, ch); // заменить 6 на >=8 – ошибка выполнения
        System.out.println(a);
        ListIterator<Character> it;// параметризация обязательна
        it= a.listIterator(2);// извлечение итератора списка в позицию
        System.out.println("добавление элемента в позицию " + it.nextIndex());
        it.add('X');// добавление элемента без замены в позицию итератора
        System.out.println(a); // сравнить методы
        int index = a.lastIndexOf(ch); // a.indexOf(ch);
        a.set(index, 'W'); // замена элемента без итератора
        System.out.println(a + "после замены элемента");
        if (a.contains(ch)) { a.remove(a.indexOf(ch)); }
        System.out.println(a + "удален элемент " + ch);
    }
}
