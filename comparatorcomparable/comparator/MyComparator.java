package comparatorcomparable.comparator;

import java.util.Comparator;

public class MyComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        // Sort by age
        return s1.getRollNo() - s2.getRollNo();
    }
}
