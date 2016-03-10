package lesson_01.examples;

/**
 * Created by galina on 2/28/16.
 */
public class DataTypesPart1 {

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


       // По умолчанию целочисленный литерал имеет тип int, а значит,
       // в программе допустимо использовать литералы только от 0 до 2147483648, иначе возникнет ошибка компиляции.
       // Примеры :
        //  long iiiii= 2147483648; // Ошибка компиляции так как
        int x = -2147483648;  // верно
      //  int y = -5-2147483648; // Ошибка компиляции

       /* Тип long имеет длину 64 бита, а значит, позволяет хранить значения от -263 до 263-1.
       Чтобы ввести такой литерал,  необходимо в конце поставить латинскую букву L или l, тогда все значение будет трактоваться как long.
       Аналогично можно выписать максимальные допустимые значения для них:
         */
       long l1 = 9223372036854775807L; // максимальные допустимое значение;
       long l2 = -9223372036854775808L; // минимально допустимое значение;

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




      //  -------------------------------------------- ПРОДОЛЖЕНИЕ
      int iMin = -2147483648;
      int invert= -iMin;
      System.out.println(iMin == invert);
      //При инвертировании числа -2147483648, мы видим, что математический результат равен в точности +2^31,
      // или, в двоичном формате, 1000 0000 0000 0000 0000 0000 0000 0000 (единица и 31 ноль).
      // Но тип int рассматривает первую единицу как знаковый бит, и результат получается равным -2147483648.

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

    }
}