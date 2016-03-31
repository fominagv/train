package lesson_06.examples;

import java.util.ArrayList;

/**
 * Created by galina on 3/31/16.
 */
    public class UncheckCheck {
        public static void main(String args[]) {
            ArrayList list = new ArrayList();
            list.add(71);
            list.add(new Boolean("TruE"));
            list.add("Java 1.6.0");
// требуется приведение типов
            int i = (Integer)list.get(0);
            boolean b = (Boolean)list.get(1);
            String str = (String)list.get(2);
            for (Object ob : list)
            System.out.println("list " + ob);

            ArrayList<Integer> s = new ArrayList<Integer>();
            s.add(71);
            s.add(92);
            // s.add( ￼ ;// ошибка компиляции: s параметризован
            for (Integer ob : s)
            System.out.print("int " + ob);
        }

}
