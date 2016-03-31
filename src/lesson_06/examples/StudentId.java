package lesson_06.examples;

import java.util.Comparator;

/**
 * Created by galina on 3/31/16.
 */
public class StudentId implements Comparator<Student> {
    public int compare(Student one, Student two) {
    return two.getIdStudent() - one.getIdStudent();
    }
}
