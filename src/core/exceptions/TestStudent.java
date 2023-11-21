package core.exceptions;

public class TestStudent {
    static Student[] students = {
            new Student("John", "Math"),
            new Student("Almas", "Economy")
    };
    public static void main(String[] args) {
        String studentName = "NoName";
        try {
            Student student = findStudentByName(studentName);
            System.out.println(student);
        } catch (StudentNotFoundException e) {
            System.out.println("Студента с именем " + studentName + " не существует");;
        }
    }

    public static Student findStudentByName (String studentName) throws StudentNotFoundException {
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName().equals(studentName)) {
                return students[i];
            }
        }
        throw new StudentNotFoundException("Student not found!");
    }
}
