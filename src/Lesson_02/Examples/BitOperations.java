package Lesson_02.Examples;

/**
 * Created by galina on 2/28/16.
 */
public class BitOperations {

    public static void main(String[] args) {
        /*************************************************************************
                    Представление целых чисел в двоичном виде:
        **************************************************************************
         0   0
         1   1
         2   10
         3   11
         4   100
         5   101
         и так далее.
         Как представляются отрицательные числа?
         Во-первых, вводят понятие знакового бита.
         Первый бит начинает отвечать за знак, а именно 0 означает положительное число, 1 – отрицательное.
         Но не следует думать, что остальные биты остаются неизменными.
        Алгоритм получения отрицательного числа. Чтобы получить значение -1, надо из 0 вычесть 1:

         00000000
         - 00000001
         ------------
         - 11111111
         Итак, -1 в двоичном виде представляется как 11111111. Продолжаем применять тот же алгоритм (вычитаем 1):

         0 00000000
         -1 11111111
         -2 11111110
         -3 11111101
         и так далее до значения 10000000, которое представляет собой наибольшее по модулю отрицательное число.
         Для 8-битового представления наибольшее положительное число 01111111 (=127),

         а наименьшее отрицательное 10000000 (=-128). Поскольку всего 8 бит определяет 28=256 значений,
         причем одно из них отводится для нуля, то становится ясно,
         почему наибольшие по модулю положительные и отрицательные значения различаются на единицу, а не совпадают.

         01111111    127
         +00000001   + 1
         ---------  ------
         10000000   -128

          01111111    127
         +00000010   +  2
         ---------  ------
          10000001   -127


         01111111    127
         +00000011  +  3
         ---------  ------
         10000011   -126

         Как известно, битовые операции "и", "или", "исключающее или" принимают два аргумента
         и выполняют логическое действие попарно над соответствующими битами аргументов.
         При этом используются те же обозначения, что и для логических операторов,
         но, конечно, только в первом (одиночном) варианте. Например, вычислим выражение 5&6:

         00000101
         & 00000110
         -------------
         00000100

         // число 5 в двоичном виде
         // число 6 в двоичном виде

         //проделали операцию "и" попарно над битами
         // в каждой позиции
         То есть выражение 5&6 равно 4.

         Исключение составляет лишь оператор "не" или "NOT",
         который для побитовых операций записывается как ~ (для логических было !).
         Этот оператор меняет каждый бит в числе на противоположный.
         Например, ~(-1)=0. Можно легко установить общее правило для получения битового представления отрицательных чисел:
         Если n – целое положительное число, то -n в битовом представлении равняется ~(n-1).
         Наконец, осталось рассмотреть лишь операторы побитового сдвига.
         В Java есть один оператор сдвига влево и два варианта сдвига вправо.
         Такое различие связано с наличием знакового бита.
         При сдвиге влево оператором << все биты числа смещаются на указанное количество позиций влево,
         причем освободившиеся справа позиции заполняются нулями.
         Эта операция аналогична умножению на 2n и действует вполне предсказуемо, как при положительных,
         так и при отрицательных аргументах.

         Рассмотрим примеры применения операторов сдвига для значений типа int, т.е. 32-битных чисел. Пусть положительным аргументом будет число 20, а отрицательным -21.

         // Сдвиг влево для положительного числа 20
         20 << 00 = 00000000000000000000000000010100 = 20
         20 << 01 = 00000000000000000000000000101000 = 40
         20 << 02 = 00000000000000000000000001010000 = 80
         20 << 03 = 00000000000000000000000010100000 = 160
         20 << 04 = 00000000000000000000000101000000 = 320
         ...
         20 << 25 = 00101000000000000000000000000000 = 671088640
         20 << 26 = 01010000000000000000000000000000 = 1342177280
         20 << 27 = 10100000000000000000000000000000 = -1610612736
         20 << 28 = 01000000000000000000000000000000 = 1073741824
         20 << 29 = 10000000000000000000000000000000 = -2147483648
         20 << 30 = 00000000000000000000000000000000 = 0
         20 << 31 = 00000000000000000000000000000000 = 0
         // Сдвиг влево для отрицательного числа -21
         -21 << 00 = 11111111111111111111111111101011 = -21
         -21 << 01 = 11111111111111111111111111010110 = -42
         -21 << 02 = 11111111111111111111111110101100 = -84
         -21 << 03 = 11111111111111111111111101011000 = -168
         -21 << 04 = 11111111111111111111111010110000 = -336
         -21 << 05 = 11111111111111111111110101100000 = -672
         ...
         -21 << 25 = 11010110000000000000000000000000 = -704643072
         -21 << 26 = 10101100000000000000000000000000 = -1409286144
         -21 << 27 = 01011000000000000000000000000000 = 1476395008
         -21 << 28 = 10110000000000000000000000000000 = -1342177280
         -21 << 29 = 01100000000000000000000000000000 = 1610612736
         -21 << 30 = 11000000000000000000000000000000 = -1073741824
         -21 << 31 = 10000000000000000000000000000000 = -2147483648
         Как видно из примера, неожиданности возникают тогда, когда значащие биты начинают занимать первую позицию и влиять на знак результата.

         При сдвиге вправо все биты аргумента смещаются на указанное количество позиций, соответственно, вправо. Однако встает вопрос – каким значением заполнять освобождающиеся позиции слева, в том числе и отвечающую за знак. Есть два варианта. Оператор >> использует для заполнения этих позиций значение знакового бита, то есть результат всегда имеет тот же знак, что и начальное значение. Второй оператор >>> заполняет их нулями, то есть результат всегда положительный.

         // Сдвиг вправо для положительного числа 20
         // Оператор >>
         20 >> 00 = 00000000000000000000000000010100 = 20
         20 >> 01 = 00000000000000000000000000001010 = 10
         20 >> 02 = 00000000000000000000000000000101 = 5
         20 >> 03 = 00000000000000000000000000000010 = 2
         20 >> 04 = 00000000000000000000000000000001 = 1
         20 >> 05 = 00000000000000000000000000000000 = 0
         // Оператор >>>
         20 >>> 00 = 00000000000000000000000000010100 = 20
         20 >>> 01 = 00000000000000000000000000001010 = 10
         20 >>> 02 = 00000000000000000000000000000101 = 5
         20 >>> 03 = 00000000000000000000000000000010 = 2
         20 >>> 04 = 00000000000000000000000000000001 = 1
         20 >>> 05 = 00000000000000000000000000000000 = 0
         Очевидно, что для положительного аргумента операторы >> и >>> работают совершенно одинаково. Дальнейший сдвиг на большее количество позиций будет также давать нулевой результат.

         // Сдвиг вправо для отрицательного числа -21
         // Оператор >>
         -21 >> 00 = 11111111111111111111111111101011 = -21
         -21 >> 01 = 11111111111111111111111111110101 = -11
         -21 >> 02 = 11111111111111111111111111111010 = -6
         -21 >> 03 = 11111111111111111111111111111101 = -3
         -21 >> 04 = 11111111111111111111111111111110 = -2
         -21 >> 05 = 11111111111111111111111111111111 = -1
         // Оператор >>>
         -21 >>> 00 = 11111111111111111111111111101011 = -21
         -21 >>> 01 = 01111111111111111111111111110101 = 2147483637
         -21 >>> 02 = 00111111111111111111111111111010 = 1073741818
         -21 >>> 03 = 00011111111111111111111111111101 = 536870909
         -21 >>> 04 = 00001111111111111111111111111110 = 268435454
         -21 >>> 05 = 00000111111111111111111111111111 = 134217727
         ...
         -21 >>> 24 = 00000000000000000000000011111111 = 255
         -21 >>> 25 = 00000000000000000000000001111111 = 127
         -21 >>> 26 = 00000000000000000000000000111111 = 63
         -21 >>> 27 = 00000000000000000000000000011111 = 31
         -21 >>> 28 = 00000000000000000000000000001111 = 15
         -21 >>> 29 = 00000000000000000000000000000111 = 7
         -21 >>> 30 = 00000000000000000000000000000011 = 3
         -21 >>> 31 = 00000000000000000000000000000001 = 1 */
    }

}