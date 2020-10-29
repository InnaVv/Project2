package by.issoft.student;

import java.util.List;

public class ParentClass {

    String name;
    List<Student> students;
    int total;
    Double averageMark;

    public ParentClass(String name, List<Student> students) {
        this.name = name;
        this.students = students;
    }

    public void doExam() {
        for (Student xxx : students) {
            total += xxx.passExam();
            System.out.println(xxx.name + " has mark " + xxx.passExam());
        }
        System.out.println(total + " is total");
    }

    public Double calculateMark() {
        averageMark = Double.valueOf(total) / Double.valueOf(students.size()) ;
        return averageMark;
    }
}
