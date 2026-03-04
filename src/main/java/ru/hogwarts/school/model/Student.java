package ru.hogwarts.school.model;


public class Student {
    private Long studentId;
    private String name;
    private int age;

    @ru.hogwarts.school.model.ManyToOne
    private Faculty faculty;

    public Faculty getFaculty() {
        return getFaculty();
    }

    public void setName(String name) {
    }

    public void setAge(int age) {
    }

    public void setStudentId(long l) {
    }

    public boolean getStudentId() {
        return getStudentId();
    }

    public boolean getName() {
        return getName();
    }

    public boolean getAge() {
        return getAge();
    }
}
