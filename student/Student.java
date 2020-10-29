package by.issoft.student;

import java.util.Random;

public class Student {

    String name;
    int mark;

    public Student(String name) {

        this.name = name;
    }

    public int passExam() {
        mark = new Random().nextInt(10);
        return mark;
    }

}
