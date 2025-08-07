import model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Nguyen Van A", "12/09/2002", "0901234567"));
        students.add(new Student(2, "Tran Thi B", "05/01/2001", "0912345678"));
        students.add(new Student(3, "Le Van C", "20/08/2003", "0987654321"));
        students.add(new Student(4, "Pham Thi D", "15/07/2001", "0978123456"));

        students.sort(Comparator.comparing(Student::getBirthday));

        System.out.println("Student list sorted by birthday:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
