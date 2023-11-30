package core.generics.practice.task6;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        StudentList<Student> list = new StudentList<>();
        Student student1 = new Student("Baglan", "Imanbekov", 1, 2.5);
        Student student2 = new Student("Gulshat", "Yesetovna", 2, 2.5);
        Student student3 = new Student("Zhansaya", "Kozhdan", 3, 2.5);
        Student student4 = new Student("Kulyash", "Bazarbayeva", 4, 2.5);

        list.addStudent(student1);
        list.addStudent(student2);
        list.addStudent(student3);
        list.addStudent(student4);

        list.sortByLastName();

        for(Student student : list.getStudents()) {
            System.out.println(student.getLastName());
        }
    }
}
