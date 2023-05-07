package data;

import model.Dep;
import model.Student;

import java.util.ArrayList;
import java.util.List;


public class Data {

    private static Data INSTANCE;

    private List<Dep> deps;

//    private List<Student> students;
//    private List<String> students;


    private Data() {
        deps=new ArrayList<>();
        List<Student> students=new ArrayList<>();
        students.add(new Student("S1","Student 1",35));
        students.add(new Student("S2","Student 2",70));
        students.add(new Student("S3","Student 3",60));
        students.add(new Student("S4","Student 4",90));
        deps.add(new Dep("Dep 1",students));

        deps.add(new Dep("Dep 2",new Student("S5",30)));

        deps.add(new Dep("Dep 3",
                new Student("S6",32),
                new Student("S7",70),
        new Student("S8",20)));

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

}
