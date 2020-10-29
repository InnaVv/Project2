package by.issoft.student;

import java.util.List;

public class Group {

    String name;
    List<Student> students;
    int total;
    Double averageMark;

    public Group(String name) {
        this.name = name;
    }

    public void addStudents(List<Student> students) {
        this.students = students;
    }

    public void doExam() {
        for (Student xxx : students) {
            total += xxx.passExam();
            System.out.println(xxx.name + " has mark " + xxx.passExam());
        }
//        System.out.println(total + " is total");
    }

    public Double calculateMark() {
        averageMark = Double.valueOf(total) / Double.valueOf(students.size()) ;
        return averageMark;
    }
}
