package comparatorcomparable.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 22, 101));
        students.add(new Student("Bob", 18, 102));
        students.add(new Student("Charlie", 20, 103));

        System.out.println(students);
//        Collections.sort(students,(s1, s2) -> s1.getAge() - s2.getAge());  // uses compareTo()
//        students.sort();
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getAge() - s2.getAge(); // ascending order
            }
        });
        for (Student s : students) {
            System.out.println(s);
        }
        students.sort(new MyComparator());



        for (Student s : students) {
            System.out.println(s);
        }
    }
}