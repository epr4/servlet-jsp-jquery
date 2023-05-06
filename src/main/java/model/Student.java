package model;

public class Student {
    String id;

    public Student(String id) {
        this.id=id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}';
    }
}
