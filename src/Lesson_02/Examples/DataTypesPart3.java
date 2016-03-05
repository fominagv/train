package Lesson_02.Examples;

/**
 * Created by galina on 2/28/16.
 */
public class DataTypesPart3 {

    public static void main(String[] args) {
/*************************************************
 *                ССЫЛОЧНЫЕ ТИПЫ
 *************************************************/
/* Выражение ссылочного типа имеет значение либо null,
   либо ссылку, указывающую на некоторый объект в виртуальной памяти JVM.
 --------------------------------- Объекты и правила работы с ними -----------------
 Объект (object) – это экземпляр некоторого класса, или экземпляр массива.
 Класс – это описание объектов одинаковой структуры, и если в программе такой класс используется,
 то описание присутствует в единственном экземпляре. Объектов этого класса может не быть вовсе,
  а может быть создано сколь угодно много.
Объекты всегда создаются с использованием ключевого слова new, причем одно слово new порождает строго один объект(или вовсе ни одного,
 если происходит ошибка). После ключевого слова указывается имя класса, от которого мы собираемся породить объект.
  Создание объекта всегда происходит через вызов одного из конструкторов класса (их может быть несколько),
  поэтому в заключение ставятся скобки, в которых перечислены значения аргументов,передаваемых выбранному конструктору.*/

        class Point {
            int x, y;

            /**
             * Конструктор принимает 2 аргумента,
             * которыми инициализирует поля объекта.
             */
            Point (int newx, int newy){
                x=newx;
                y=newy;
            }

        /*    @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }*/
       /*     @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;

                Point point = (Point) o;

                if (x != point.x) return false;
                return y == point.y;

            }

            @Override
            public int hashCode() {
                int result = x;
                result = 31 * result + y;
                return result;
            }
*/
        }
        //Если конструктор отработал успешно, то выражение new возвращает ссылку на созданный объект.
        // Эту ссылку можно сохранить в переменной, передать в качестве аргумента в какой-либо метод или использовать другим способом.
        // JVM всегда занимается подсчетом хранимых ссылок на каждый объект.
        // Как только обнаруживается, что ссылок больше нет, такой объект предназначается для уничтожения сборщиком мусора (garbage collector).
        // Восстановить ссылку на такой "потерянный" объект невозможно.

        Point p=new Point(1,2); // Создали объект, получили на него ссылку
        Point p3=p;  // теперь есть 2 ссылки на точку (1,2)
        p=new Point(3,4); // осталась одна ссылка на точку (1,2)
        p3=null;  // Ссылок на объект-точку (1,2) больше нет, доступ к нему утерян и он вскоре будет уничтожен сборщиком мусора.

        /* Любой объект порождается только с применением ключевого слова new.
         Единственное исключение – экземпляры класса String.
         Записывая любой строковый литерал, мы автоматически порождаем объект этого класса.
         Оператор конкатенации +, результатом которого является строка, также неявно порождает объекты без использования ключевого слова new.*/
        //Пример:

        String result = "abc"+"def"; //При выполнении этого выражения будет создано три объекта класса String.
                                    // Два объекта порождаются строковыми литералами,
                                    // третий будет представлять результат конкатенации.
        // Операция создания объекта – одна из самых ресурсоемких в Java. Поэтому следует избегать ненужных порождений.
        // Поскольку при работе со строками их может создаваться довольно много, компилятор, как правило, пытается оптимизировать такие выражения.
        // В рассмотренном примере, поскольку все операнды являются константами времени компиляции,
        // компилятор сам осуществит конкатенацию и вставит в код уже результат, сократив таким образом количество создаваемых объектов до одного.

        //Кроме того в Java есть технология reflection, которая позволяет обращаться к классам, методам и полям,
        // используя лишь их имя в текстовом виде. С ее помощью также можно создать объект без ключевого слова new,
        // однако эта технология довольно специфична, применяется в редких случаях.
        // Пример ее применения:
        Point pr = null;
        try {
            // в следующей строке, используя лишь
            // текстовое имя класса Point, порождается
            // объект без применения ключевого слова new
            pr=(Point)Class.forName("Point").newInstance();

        } catch (Exception e) { // обработка ошибок
            System.out.println(e);
        }


        //Объект всегда "помнит", от какого класса он был порожден.
        // Объявляем класс Parent
        class Parent {
        }

// Объявляем класс Child и наследуем его от класса Parent
        class Child extends Parent {
        }
        //Далее объявим переменную одного типа и проинициализируем ее значением другого типа:
        Parent parent = new Child(); // переменная типа Parent указывает на объект, порожденный от класса Child


   //     --------------------------------- Операции над ссылочными типами -----------------/;
        /*
        обращение к полям и методам объекта
        оператор instanceof (возвращает булево значение)
        операции сравнения == и != (возвращают булево значение)
        оператор приведения типов
        оператор с условием ?:
        оператор конкатенации со строкой +    */



        Point p1 = new Point(3,5);
        System.out.println("p1 = "+p1);
        Point p2 = new Point(3,5) ;
        System.out.println("p2 = "+p2);
        System.out.println("p1==p2 :"+(p1==p2));
        System.out.println("p1.equals(p2) : "+p1.equals(p2));

    }

}