package Lesson_01.Examples;

/**
 * Created by galina on 2/28/16.
 */
public class DataTypes {

    static class Point {
        int x, y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) {
        /*Все типы данных разделяются на две группы.
          Первую составляют 8 простых, или примитивных тиров данных
          Они подразделяются на три подгруппы:
          целочисленные : byte, short, int, long, char
          дробные: float, double
          булевые: boolean
          Вторую группу составляют объектные, или ссылочные (от английского reference), типы данных.
          Это все классы, интерфейсы и массивы.

     /* Тип	Размер, бит	Значение по умолчанию	Минимальное значение    	Максимальное значение
        byte       	8       	0               -128 (-2^7)                 127 (2^7-1)
        char     	16	      'x0'	            0                       	65535                интерпретируются как коды символов по таблице Unicode
        short   	16      	0           	-32768 (-2^15)              32767  (2^15-1)
        int	        32      	0              	-2147483648	(-2^31)         2147483647 (2^31-1)
        long    	64      	0              	-9223372036854775808(-2^63)	9223372036854775807 (2^63-1)
        float   	32      	0.0F        	-224*10104	                224*10104
        double  	64	        0.0D        	-253*10970	                253*10970   */

        /******************************************************
         Различие между примитивными и ссылочными типами данных.
         *******************************************************/

        /* Рассмотрим пример, когда объявляются две переменные одного типа, приравниваются друг другу,
         а затем значение одной из них изменяется. Что произойдет со второй переменной?
        */

        // Переменные простого типа хранят непосредственно свои значения
        // и при приравнивании двух переменных происходит копирование данного значения.

       // Пример 1:
        int a = 5;   // объявляем первую переменную и инициализируем ее
        int b = a;   // объявляем вторую переменную и приравниваем ее к первой
        a = 3;       // меняем значение первой
        System.out.println("b = " + b);  // проверяем значение второй    Результат  b = 5

        // Пример 2:
        byte byteV = 3;
        int intV = byteV;
        byteV = 5;
        System.out.println("intV = " + intV);  //Результат intV = 3 типа int

        //Объектные переменные после приравнивания остаются "связанными" друг с другом,
        // изменения одной сказываются на другой.

        // Пример 1:
        Point p1 = new Point(3, 5);     // Создаем объект p1 типа Point p1.x=3, p1.y=5
        Point p2 = p1;                  // Создаем объект p2 копированием ссылки объект p1
        p1.x = 7;                       // Изменяем координату x у объекта p1 на 7
        System.out.println("p2.x = " + p2.x); // Координата x у p2 тоже изменилась Рузультат p2.x = 7
        // Пример 2:
        Point p3 = new Point(3, 5);      // Создаем объект p3 типа Point p3.x=3, p3.y=5
        Point p4 = p3;                   // Создаем объект p4 копированием ссылки объект p3
        p3 = new Point(7, 9);            // Меняем ссылку объекта p3 на другой объкет  p3.x=7, p3.y=9
        System.out.println("p4.x = " + p4.x);   //Так как теперь p3 и p4 сылаются на разные объекты координаты p4 не изменились. Рузультат p4.x = 3

/*************************************************************
 *                        Целочисленные типы
 *************************************************************/
//byte, short, int, long являются знаковыми типами
// Целочисленные литералы имеют тип int по умолчанию, или тип long, если стоит буква L или l
/* Над целочисленными аргументами можно производить следующие операции:
* операции сравнения (возвращают булево значение) <, <=, >, >=, ==, !=
* числовые операции (возвращают числовое значение)
   * унарные операции + и -
   * арифметические операции +, -, *, /, %
   * операции инкремента и декремента (в префиксной и постфиксной форме): ++ и --
   * операции битового сдвига <<, >>, >>>
* битовые операции ~, &, |, ^
* оператор с условием ?:
* оператор приведения типов
* оператор конкатенации со строкой +                  */
// операторы + и -, могут быть как бинарными (иметь два операнда), так и унарными (иметь один операнд).
/* Числовые операции в Java обладают особенностью. Хотя целочисленные типы имеют длину 8, 16, 32 и 64 бита,
 вычисления проводятся только с 32-х и 64-х битной точностью.
 Если хотя бы один аргумент операции имеет тип long, то все аргументы приводятся к этому типу,
 и результат операции также будет типа long. Вычисление будет произведено с точностью в 64 бита,
 а более старшие биты, если таковые появляются в результате, отбрасываются.
 Если же аргументов типа long нет, то вычисление производится с точностью в 32 бита,
 и все аргументы преобразуются в int (это относится к byte, short, char ).
  Результат также имеет тип int. Все биты старше 32-го игнорируются.
*/
        // Пример 1:
        byte byteVer = 1;
        short shortVer = 1;
        int  intVer = 1;
        long longVer = 1;

      // byte iii= byteVer+shortVer; Ошибка компиляции byteVer+shortVer возвращает int
      //  short iii= byteVer+shortVer; Ошибка компиляции byteVer+shortVer возвращает int
        int iii1= byteVer+shortVer;
        long iii2= byteVer+shortVer;

       // int iii3 =  intVer + iii2;  //Ошибка компиляции intVer + iii2 возвращает long
        long iii3 =  intVer + iii2;

       // int iii4 =  intVer + 1l; //Ошибка компиляции intVer + 1l возвращает long

       // byte iii5= byteVer+1; //Ошибка компиляции byteVer+1 возвращает int

/*********************************************************
                   Переполнение типов
 *********************************************************/

        // Пример 1:
        byte bv = 127;
        System.out.println("bv = " + (++bv)); //Результат bv = -128 (128 -128 -128)

        // Пример 2:
        int i = 50000;
        System.out.println("i * i = " + i * i);   // умножение с точностью 32 бита Результат x * x = -1794967296 (-1794967296 = 2500000000 - 2147483648 -2147483648)
        long m = i;
        System.out.println("m * m = " + m * m);   // умножение с точностью 64 бита результат m * m = 2500000000

        // Пример 3:
        System.out.println(1000 * 60 * 60 * 24 * 7); //Результат 604800000
        // вычисление для недели
        System.out.println(1000 * 60 * 60 * 24 * 30); //Результат -1702967296 переполнение (2592000000 - 2147483648 -2147483648)
        // вычисление для месяца
        System.out.println(1000L * 60 * 60 * 24 * 30); //Результат 2592000000
        // вычисление для месяца
/*******************************************************************************
         Bсе числовые операторы возвращают результат типа int или long.
 ********************************************************************************/
        // пример вызовет ошибку компиляции
        int x1 = 1;
      //  byte b1 = x1;

        // пример вызовет ошибку компиляции
        byte b3 = 1;
      //  byte c3 = b3+1;

        // пример вызовет ошибку компиляции
        int x3 = 2;
        long y3 = 3;
      //  int z3 = x3+y3;


        // Bсе числовые операторы возвращают результат типа int или long. Однако существует два исключения.
        // Первое из них – операторы инкрементации и декрементации.
        // Их действие заключается в прибавлении или вычитании единицы из значения переменной,
        // после чего результат сохраняется в этой переменной и значение всей операции равно значению переменной
        // (до или после изменения, в зависимости от того, является оператор префиксным или постфиксным).
        // А значит, и тип значения совпадает с типом переменной.
        // (На самом деле, вычисления все равно производятся с точностью минимум 32 бита,
        // однако при присвоении переменной результата его тип понижается.)

        byte x7 = 5;
        System.out.println("x7++ = " + x7++);  // на момент начала исполнения x равен 5
        System.out.println("x7-- = " + x7--); //на момент начала исполнения x равен 6
        System.out.println("++x7 = " + (++x7)); // на момент начала исполнения x равен 5
        System.out.println("--x7 = " + (--x7));  // на момент начала исполнения x равен 6


//Этот пример иллюстрирует вопросы преобразования типов при вычислениях и случаи переполнения.

        byte x9 = -128;
        System.out.println("-x9 = " + (-x9));

        byte y9 = 127;
        System.out.println("++y9 = " + (++y9));

        // Вторым исключением является оператор с условием ?:.
        // Если второй и третий операнды имеют одинаковый тип, то и результат операции будет такого же типа.

        byte x10 = 2;
        byte y10 = 3;
        byte z = (x10 > y10) ? x10 : y10;
        // верно, x10 и y10 одинакового типа
        //  byte abs=(x10>0) ? x10 : -x10;  // неверно!

        // Последняя строка неверна, так как третий аргумент содержит числовую операцию,
        // стало быть, его тип int, а значит, и тип всей операции будет int, и присвоение некорректно.
        // Даже если второй аргумент имеет тип byte, а третий – short, значение будет типа int.

        // Наконец, рассмотрим оператор конкатенации со строкой.
        // Оператор + может принимать в качестве аргумента строковые величины.
        // Если одним из аргументов является строка, а вторым – целое число,
        // то число будет преобразовано в текст и строки объединятся.

        int x11 = 1;
        System.out.println("x11 = " + x11);

        System.out.println(1 + 2 + "text");
        System.out.println("text" + 1 + 2);

        // Pассмотрим работу с типом char. Значения этого типа могут полноценно участвовать в числовых операциях:
        // char – единственный беззнаковый тип.
        // Инициализировать его можно как символьным, так и целочисленным литералом.
        char c1 = 10;
        char c2 = 'A';
        // латинская буква A (\u0041, код 65)
        int i12 = c1 + c2 - 'B'; //Переменная i12 получит значение 9.

        char c13 = 'A';
        System.out.println(c13);
        System.out.println(c13 + 1);
        System.out.println("c13 = " + c13);
       // System.out.println('c' + '=' + c13);

        //В первом случае в метод println было передано значение типа char, поэтому отобразился символ.
        // Во втором случае был передан результат сложения, то есть число, и именно число появилось на экране.
        // Далее при сложении со строкой тип char был преобразован в текст в виде символа.
        // Наконец в последней строке произошло сложение трех чисел: 'c' (код 99), '=' (код 61) и переменной c (т.е. код 'A' - 65 ).

        //  --------------------------------------------------------------

        //  Название типа	Длина (байты)	Область значений
        //   float          |   	4         | 3.40282347e+38f ; 1.40239846e-45f
        //   double         |    	8         | 1.79769313486231570e+308 ; 4.94065645841246544e-324

        // пример вызовет ошибку компиляции
        //    float f = 1e40f; // значение слишком велико, overflow
        //    double d = 1e-350; // значение слишком мало, underflow

        //Eсли в конце литерала стоит буква F или f, то литерал рассматривается как значение типа float.
        // По умолчанию дробный литерал имеет тип double, при желании это можно подчеркнуть буквой D или d.

        //  * операции сравнения (возвращают булево значение):  <, <=, >, >= ,==, !=
        //  * числовые операции (возвращают числовое значение)
        // -  унарные операции + и -
        // -  арифметические операции +, -, *, /, %
        // -  операции инкремента и декремента (в префиксной и постфиксной форме): ++ и --
        //  * оператор с условием ?:
        //  * оператор приведения типов
        //  * оператор конкатенации со строкой +


        double doubleV = (double)1 / 2;
        System.out.println("doubleV = " + doubleV);


        System.out.println(1e-40f / 1e10f);   // underflow для float
        System.out.println(-1e-300 / 1e100);  // underflow для double
        float f = 1e-6f;
        System.out.println("f = " + f);   //Результат f = 1.0E-6
        f += 0.002f;
        System.out.println("f = " + f);   //Результат f = 0.002001
        f += 3;
        System.out.println("f = " + f);    //Результат f = 3.002001
        f += 4000;
        System.out.println("f = " + f); //Результат f = 4003.002
        //Как видно, в последней строке был утрачен 6-й разряд после десятичной точки.


        double d = 1e-305 * Math.PI;
        System.out.println(d);            // Результат 3.141592653589793E-305
        for (int r = 0; r < 4; r++)
            System.out.println(d /= 100000);   //  Результат 3.1415926535898E-310   ; 3.141592653E-315 ; 3.142E-320 ;0.0

        // ПРЕОБРАЗОВАНИЕ ТИПОВ.
        // Если хотя бы один аргумент имеет тип double, то значения всех аргументов приводятся к этому типу
        // и результат операции также будет иметь тип double. Вычисление будет произведено с точностью в 64 бита.
        // Если же аргументов типа double нет, а хотя бы один аргумент имеет тип float, то все аргументы приводятся к float,
        // вычисление производится с точностью в 32 бита и результат имеет тип float.
        // Эти утверждения верны и в случае, если один из аргументов целочисленный.Если хотя бы один из аргументов
        // имеет значение NaN, то и результатом операции будет NaN.


        System.out.println("1/2 = " + 1 / 2);  // Результат  ?
        System.out.println("1/2. = " + 1 / 2.); // Результат ?

        //  Достаточно одного дробного аргумента, чтобы результат операции также имел дробный тип.

        int x33 = 3;
        int y33 = 5;
        System.out.println(x33 / y33);        //  Результат  0
        System.out.println((double) x33 / y33);  // Результат  0.6
        System.out.println(1.0 * x33 / y33);      //  Результат 0.6
        System.out.println("3.84 = " + ((int) 3.84));     //  Результат 3
        System.out.println("-3.84 = " + ((int) -3.84));    //  Результат -3

        long l = 111111111111L;
        float f10 = l;
        l = (long) f10;
        System.out.println(l);     //  Результат 111111110656


        // BOOLEAN
        // Над булевыми аргументами можно производить следующие операции:
        // * операции сравнения (возвращают булево значение) : ==, !=
        // * логические операции (возвращают булево значение): !, &, |, ^, &&, ||
        //* оператор с условием ?:
        //* оператор конкатенации со строкой +
        //В операторе с условием ?: первым аргументом может быть только значение типа boolean.
        //Операция конкатенации со строкой превращает булеву величину в текст "true" или "false" в зависимости от значения.

    }
}