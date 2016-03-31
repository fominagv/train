package lesson_06.examples;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

/**
 * Created by galina on 3/31/16.
 */
public class DemoLinkedList {
    public static void main(String[] args){
        LinkedList<Number> a = new LinkedList<Number>();
        for(int i = 10; i <= 15; i++)
            a.add(i);
        for(int i = 16; i <= 20; i++)
            a.add(new Float(i));
        ListIterator<Number> list = a.listIterator(10);
        System.out.println("\n" + list.nextIndex()
                + "-й индекс");
        list.next(); // важно!
        System.out.println(list.nextIndex() + "-й индекс");
        list.remove(); // удаление элемента с текущим индексом
        while(list.hasPrevious())
        System.out.print(list.previous()+" ");//вывод в обратном порядке
        // демонстрация работы методов
        a.removeFirst();
        a.offer(71); // добавление элемента в конец списка
        a.poll(); // удаление нулевого элемента из списка
        a.remove();// удаление нулевого элемента из списка
        a.remove(1);// удаление первого элемента из списка
        System.out.println("\n" + a);
        Queue<Number> q = a; // список в очередь
        for (Number i : q) // вывод элементов
        System.out.print(i + " "); System.out.println(" :size= " + q.size());
// удаление пяти элементов
        for (int i = 0; i < 5; i++) { Number res = q.poll();
        }
        System.out.print("size= " + q.size()); }


}
