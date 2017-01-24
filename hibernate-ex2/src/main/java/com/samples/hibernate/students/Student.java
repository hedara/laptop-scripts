package com.samples.hibernate.students;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by edara on 8/20/16.
 */
public class Student {
    private int sid;
    private String name;
    private Set<Course> courses = new HashSet<Course>();

    public Student(int sid, String name) {
        this.sid = sid;
        this.name = name;

    }
    public Student() {}
    public void addCourse(Course course) {
        if(course != null)
            getCourses().add(course);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getSid() != student.getSid()) return false;
        return getName().equals(student.getName());

    }

    @Override
    public int hashCode() {
        int result = getSid();
        result = 31 * result + getName().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + getSid() +
                ", name='" + getName() + '\'' +
                '}';
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }
}
