package lesson_03.examples.obscuring;

/**
 * Created by galina on 3/9/16.
 */
//Может возникнуть ситуация, когда простое имя может быть одновременно рассмотрено как имя переменной, типа или пакета.
//Пример:

import java.awt.*;

public class Obscuring {
    static Point Test = new Point(3,2);
    public static void main (String s[]) {
        System.out.print(Test.x);
    }
}
class Test {
    static int x = -5;
}


/*В методе main() простое имя Test одновременно обозначает имя поля класса Obscuring и имя другого типа,
 находящегося в том же пакете,– Test. С помощью этого имени происходит обращение к полю x, которое определено и в классе java.awt.Point и Test.
 Результатом этого примера станет 3, то есть переменная имеет более высокий приоритет.
 В свою очередь, тип имеет более высокий приоритет, чем пакет.
 Таким образом, обращение к доступному в обычных условиях типу или пакету может оказаться невозможным,
 если есть объявление одноименной переменной или типа, имеющее более высокий приоритет.
 Такое объявление называется "заслоняющим" (obscuring).
 Эта проблема скорее всего не возникнет, если следовать соглашениям по именованию элементов языка Java.
 */