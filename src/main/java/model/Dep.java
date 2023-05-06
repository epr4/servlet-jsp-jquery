package model;

import java.util.ArrayList;
import java.util.List;

public class Dep {

    public String name;
    List<Student> students;

    public Dep(String name, List<Student> students) {
        this.name=name;
        this.students=students;
    }

    public Dep(String name, Student student) {
        this.name=name;
        students=new ArrayList<>();
        students.add(student);
    }

    public Dep(String name, Student s6, Student s7, Student s8) {
        this.name=name;
        students=new ArrayList<>();
        students.add(s6);
        students.add(s7);
        students.add(s8);
    }

    public int getSize() {
        return students.size();
    }

    public List<Student> getStudents() {
        return students;
    }

    public int getPass() {
        int pass=0;
        for (Student student : students) {
            if (student.mark>=40)
                pass++;
        }
        return pass*100/students.size();
    }
}
