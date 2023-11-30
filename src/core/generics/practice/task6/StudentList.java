package core.generics.practice.task6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList <T extends Student> {
    private List<T> students = new ArrayList<>();

    public StudentList() {
    }

    public StudentList(List<T> students) {
        this.students = students;
    }

    void addStudent(T student) {
        students.add(student);
    };

    void sortByLastName() {
        Collections.sort(students, new SortByLastName());
    }

    List<T> getStudents() {
        return students;
    };
}
