package by.issoft.student;

import java.util.ArrayList;
import java.util.List;

public class Facultet {

    String name;
    List<Student> students = new ArrayList<>();

    public Facultet(String name) {
        this.name = name;
    }

    public void addStudents(List<Student> students) {

        this.students.addAll(students);
    }
}
