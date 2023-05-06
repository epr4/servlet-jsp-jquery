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

    public List<Student> getStudents() {
        return students;
    }
}
