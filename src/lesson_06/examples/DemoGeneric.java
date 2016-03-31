package lesson_06.examples;

/**
 * Created by galina on 3/31/16.
 */
import java.util.*;

public class DemoGeneric {
    public static void main(String args[]) {
        ArrayList<String> list = new ArrayList<String>();
// ArrayList<int> b = new ArrayList<int>(); // ошибка компиляции
        list.add("Java");
        list.add("Fortress");
        String res = list.get(0);/* компилятор “знает” тип значения */
// list.add(new StringBuilder("C#")); // ошибка компиляции
// компилятор не позволит добавить “посторонний” тип
        System.out.print(list);
    }
}
