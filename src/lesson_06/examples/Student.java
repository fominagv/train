package lesson_06.examples;

/**
 * Created by galina on 3/31/16.
 */
import java.util.Comparator;
public class Student implements Comparator<Student> {
    private int idStudent;
    private float meanMark;

    public Student(float m, int id) {
        meanMark = m;
        idStudent = id;
    }

    public Student() {
    }

    public float getMark() {
        return meanMark;
    }

    public int getIdStudent() {
        return idStudent;
    }

    // правило сортировки
    public int compare(Student one, Student two) {
        return
                (int) (Math.ceil(two.getMark() - one.getMark()));
    }
}
