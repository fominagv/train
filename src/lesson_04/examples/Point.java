package lesson_04.examples;

/**
 * Created by galina on 3/13/16.
 */
public class Point {
    private int x, y;

    public boolean equals(Object o) {
        if (o instanceof Point) {
            Point p = (Point)o;
            return p.x==x && p.y==y; //обращение к private-полям другого объекта.
                                    // Действие корректно, поскольку private допускает обращения из любой точки класса,
                                    // независимо от того, к какому именно объекту оно производится.
        }
        return false;
    }
}
