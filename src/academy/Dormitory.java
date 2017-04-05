package academy;

import java.util.LinkedList;

/**
 * Created by E550 on 2017-04-04.
 */

public class Dormitory {
    private LinkedList<Student> students;

    public Dormitory() {
        students = new LinkedList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void printAllStudentsInDormitory() {
        for (Student s : students) {
            System.out.println(s.greetings());
        }
    }
}