package lesson_05.examples;

/**
 * Created by galina on 3/21/16.
 */
public class Collections {
    /*
    Коллекции объектов- это очень мощный и исключительно полезный механизм. Простейшей коллекцией является массив.
    Но массив имеет ряд недостатков. Один из самых существенных - размер массива фиксируется до начала его использования.
    Т.е. мы должны заранее знать или подсчитать, сколько нам потребуется элементов коллекции до начала работы с ней.
    Коллекции обладают одним важным свойством — их размер не ограничен.
    Выделение необходимых для коллекции ресурсов спрятано внутри соответствующего класса.

    В Java коллекции объектов разбиты на три больших категории: List (список), Set (множество) и Map (отображение).
    Посмотрим документацию. В java.util определены интерфейсы:
   Collection
          |
          +------- List
          |
          +------- Set
    Map

Эти интерфейсы составляют основу для построения классов коллекций Java.

List — это список объектов. Объекты можно добавлять в список (метод add()), заменять в списке (метод set()), удалять из списка (метод remove()), извлекать (метод get()). Существует также возможность организации прохода по списку при помощи итератора.
Set — множество объектов. Те же возможности, что и у List, но объект может входить в множество только один раз. Т.е. двойное добавление одного и того же объекта в множество не изменяет само множество.
Map — отображение или ассоциативный массив. В Map мы добавляем не отдельные объекты, а пары объектов ( ключ, значение ). Соответственно есть операции поиска значения по ключу . Добавление пары с уже существующим в Map ключем приводит к замене, а не к добавлению. Из отображения (Map) можно получить множество (Set) ключей и список (List) значений.



    Пример использования одного из саммых распростроненных классов коллекции является ArrayList приведен в классе ArrayListTest*/

}