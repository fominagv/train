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
    final double pi=3.1415;
    int a=5;   // объявляем первую переменную и
    // инициализируем ее
    int b=a;   // объявляем вторую переменную и
    // приравниваем ее к первой
    a = 3;       // меняем значение первой
    System.out.println("b = " + b);  // проверяем значение второй

// Переменные простого типа хранят непосредственно свои значения
// и при приравнивании двух переменных происходит копирование данного значения.
        byte byteV=3;
        int intV=byteV;
        System.out.println("intV = " + intV);
//Объектные переменные после приравнивания остаются "связанными" друг с другом,
// изменения одной сказываются на другой.
        Point p1 = new Point(3,5);
        Point p2=p1;
        p1.x=7;
        System.out.println("p2.x = "+p2.x);

        Point p3 = new Point(3,5);
        Point p4=p3;
        p3 = new Point(7,9);
        System.out.println("p4.x = "+p4.x);

// переполнение типов
        int x= 300000;
        System.out.println("x * x = "+x * x);


        int i=300000;
        System.out.println("i * i = "+i * i);   // умножение с точностью 32 бита
        long m=i;
        System.out.println("m * m = "+m * m);   // умножение с точностью 64 бита
        System.out.println("1 / (m - i)"+1 / (m - i)); // попробуем получить разность
        // значений int и long

        double doubleV = 1/2;
        System.out.println("doubleV = "+doubleV);

        System.out.println(1000 * 60 * 60 * 24 * 7);
        // вычисление для недели
        System.out.println(1000 * 60 * 60 * 24 * 30);
        // вычисление для месяца

        System.out.println(1000 * 60 * 60 * 24 * 30L);
        // вычисление для месяца


        // пример вызовет ошибку компиляции
        int x1=1;
       // byte b1=x;

        // пример вызовет ошибку компиляции
        byte b2=1;
       // byte c2=b2+1;

        // пример вызовет ошибку компиляции
        int x3=2;
        long y3=3;
       // int z3=x3+y3;
    }


}
