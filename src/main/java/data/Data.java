package data;

import model.Student;

import java.util.ArrayList;
import java.util.List;


public class Data {

    private static Data INSTANCE;

    private List<Student> students;
//    private List<String> students;


    private Data() {
        students=new ArrayList<>();
        students.add(new Student("S1",35));
        students.add(new Student("S2",70));
/*
        students.add("S1");
        students.add("S2");
*/
    }

    public static Data getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Data();
        }

        return INSTANCE;
    }

    public List<Student> getStudents() {
//    public List<String> getStudents() {
        return students;
    }
}
