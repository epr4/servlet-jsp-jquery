package data;

import model.Dep;
import model.Student;

import java.util.ArrayList;
import java.util.List;


public class Data {

    private static Data INSTANCE;

    private List<Dep> deps;

    private List<Student> students;
//    private List<String> students;


    private Data() {
/*
        students=new ArrayList<>();
        students.add(new Student("S1",35));
        students.add(new Student("S2",70));
*/
/*
        students.add("S1");
        students.add("S2");
*/

        deps=new ArrayList<>();
        List<Student> students=new ArrayList<>();
        students.add(new Student("S1",35));
        students.add(new Student("S2",70));
        students.add(new Student("S3",60));
        students.add(new Student("S4",90));
        deps.add(new Dep("Dep 1",students));
        deps.add(new Dep("Dep 2",new Student("S5",30)));

    }

    public static Data getInstance() {
        if(INSTANCE == null) {
            INSTANCE = new Data();
        }

        return INSTANCE;
    }

    public List<Dep> getDeps() {
        return deps;
    }

    public List<Student> getStudents() {
//    public List<String> getStudents() {
        return students;
    }
}
