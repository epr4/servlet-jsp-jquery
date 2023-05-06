package data;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public class Data {

    private static Data INSTANCE;
    private List<Student> students;

    private Data() {
        students=new ArrayList<>();
        students.add(new Student("S1"));
        students.add(new Student("S2"));
    }

    public static Data getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Data();
        }

        return INSTANCE;
    }

    public List<Student> getStudents() {
        return students;
    }
}
