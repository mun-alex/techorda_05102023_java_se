package core.сollections;

import core.exceptions.Student;

import java.util.*;

public class Test {
    public static void main(String[] args) {

        int[] array = new int[10];

        Student student1 = new Student("John", "Math");
        Student student2 = new Student("Gulshat", "IT");
        Student student3 = new Student("Dina", "Ecocnomy");

        List<Student> students = new LinkedList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student2);

        Student student5 = new Student("Abylay", "IT");
        students.add(1, student5);

        students.remove(2);

        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println(students.get(3));

        System.out.println(students.contains(student1));

        Set<String> months = new TreeSet<>();
        months.add("January");
        months.add("February");
        months.add("March");
        months.add("April");
        months.add("May");
        months.add("April");

        months.remove("April");

        for (String month : months) {
            System.out.println(month);
        }
    }
}
