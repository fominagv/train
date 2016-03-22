package lesson_05.examples;
import java.util.*;
import java.io.*;
/**
 * Created by galina on 3/22/16.
 */
public class ArrayListTest {
    ArrayList lst = new ArrayList();
    Random generator = new Random();

    void addRandom() {
        lst.add(new Integer(generator.nextInt()));
    }

    public String toString() {
        return lst.toString();
    }

    public static void main(String args[]) {
        ArrayListTest tst = new ArrayListTest();
        for(int i = 0; i < 100; i++ )
            tst.addRandom();
        System.out.println("Сто случайных чисел: "+tst.toString());
    }
}
/* В классе ArrayListTest кроме класса ArrayList, использованы еще ряд классов бибилиотеки Java.

Random — класс из java.util. Расширяет возможности класса Math по генерации случайных чисел (см. документацию).
Integer — так называемый wrapper-класс (класс-обертка) для целых (int). Он использован потому, что в коллекцию нельзя занести данные элементарных типов, а только объекты классов.
Класс ArrayListTest имеет два поля — поле lst класса ArrayList и поле generator класса Random, используемое для генерации случайных чисел. Метод addRandom() генерирует и заносит в коллекцию очередное случайное число. Метод toString() просто обращается к методу toString() класса ArrayList, который обеспечивает формирование представления списка в виде строки.

Метод main(...) создает объект класса ArrayListTest и организует цикл порождени 100 случайных чисел с занесением их в коллекцию, вызыва метод addRandom(). После этого он печатает результат.

*/