package lesson_04.activities;

/**
 * Created by galina on 3/14/16.
 */

// Создать наследников класса Box: ColorBox (+ field color), HeavyBox(+ field weight)
// с хотябы одним конструктором для инициализации новых полей

class Box {
    private int width; // ширина коробки
    private int height; // высота коробки
    private int depth; // глубина коробки

    // Конструктор для создания клона объекта
    Box(Box ob) { // передача объекта конструктору
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    // Конструктор, используемый при указании всех измерений
    Box(int w, int h, int d) {
        width = w;
        height = h;
        depth = d;
    }

    // Конструктор, используемый, когда ни одно из измерений не указано
    Box() {
        // значение -1 используется
        // для указания неинициализированного параллелепипеда
        width = -1;
        height = -1;
        depth = -1;
    }

    // Конструктор для создания куба
    Box(int len) {
        width = height = depth = len;
    }

    // вычисляем объём коробки
    int getVolume() {
        return width * height * depth;
    }
}
