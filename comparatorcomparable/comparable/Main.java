package comparatorcomparable.comparable;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 101));
        students.add(new Student("Bob", 18, 102));
        students.add(new Student("Charlie", 20, 103));

        Collections.sort(students);  // uses compareTo()

        for (Student s : students) {
            System.out.println(s);
        }

        Set<Student> st = new HashSet<>();
        Student s1 = new Student("Alice", 22, 1012);
        st.add(new Student("Alice", 22, 1011));  // this will because of hash code and equal comparison
        st.add(new Student("Alice", 22, 1011));
        st.add(s1);
        st.add(s1); //it will because of reference comparison
        System.out.println("The set element are");
        for(var s : st){
            System.out.println(st);
        }
    }
}
