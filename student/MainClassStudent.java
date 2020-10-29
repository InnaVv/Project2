package by.issoft.student;

import java.util.Arrays;
import java.util.List;

public class MainClassStudent {
    public static void main(String[] args) {

        Facultet facultet = new Facultet("Facultet PSF");

        Group group1 = new Group("Group 001");

        List<Student> studentsGroup1 = Arrays.asList(
                new Student("Ivanova"),
                new Student("Petrova"),
                new Student("Sidorova")
        );
        group1.addStudents(studentsGroup1);
        facultet.addStudents(studentsGroup1);

        Group group2 = new Group("Group 222");

        List<Student> studentsGroup2 = Arrays.asList(
                new Student("Onegin"),
                new Student("Lenin"),
                new Student("Mu-Mu"),
                new Student("Lenskij")
        );
        group2.addStudents(studentsGroup2);
        facultet.addStudents(studentsGroup2);

        group2.doExam();
        System.out.println("Средний балл группы " + group2.name + " составляет " + group2.calculateMark());

//        facultet.doExam();
//        System.out.println("Средний балл всего факультета " + facultet.name + " составляет " + facultet.calculateMark());


//        System.out.println(studentsGroup1.size());
//        System.out.println(studentsGroup2.size());
//        System.out.println(facultet.students.size());
//        System.out.println(facultet.students.size());
    }
}
