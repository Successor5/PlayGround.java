import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>(5);
        students.add(new Student("Alice", 4));
        students.add(new Student("Bob", 3));
        students.add(new Student("Mike", 6));
        students.add(new Student("Jane", 6));
        students.add(new Student("John", 12));


        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getAge() < o2.getAge()) return -1;
                else if (o2.getAge() < o1.getAge()) {
                    return 1;
                }

                return o1.getName().compareTo(o2.getName());

            }
        };

        students.sort(studentComparator);
        System.out.println(students);
    }
}