package lesson_06.examples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * Created by galina on 3/31/16.
 */
public class DemoIterator {
    public static void main(String[] args) {
        ArrayList<Double> c =
                new ArrayList<Double>(7);
        for(int i = 0 ;i < 10; i++) {
            double z = new Random().nextGaussian(); c.add(z);//заполнение списка
        }
//вывод списка на консоль
        for(Double d: c) {
            System.out.printf("%.2f ",d);
        }
        int positiveNum = 0;
        int size = c.size();//определение размера коллекции
//извлечение итератора
        Iterator<Double> it = c.iterator();
//проверка существования следующего элемента
        while(it.hasNext()) {
//извлечение текущего элемента и переход к следующему
            if (it.next() > 0) positiveNum++;
            else it.remove();//удаление неположительного элемента
        } System.out.printf("%nКоличество положительных: %d ",
                positiveNum); System.out.printf("%nКоличество неположительных: %d ",
                size - positiveNum); System.out.println("\nПоложительная коллекция");
        for(Double d : c) { System.out.printf("%.2f ",d); }
    }
}
