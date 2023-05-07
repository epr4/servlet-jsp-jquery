package model;

public class Student {
    public String id;
    public String name;
    public int mark;

    public Student(String id, int mark) {
        this.id=id;
        this.name="Student "+id;
        this.mark=mark;
    }

    public Student(String id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
}
