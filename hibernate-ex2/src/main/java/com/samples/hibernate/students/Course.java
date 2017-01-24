package com.samples.hibernate.students;

import java.util.Set;

/**
 * Created by edara on 8/20/16.
 */
public class Course {
    private int cid;
    private String name;
    private String description;
    private Set<Student> students;

    public Course(int cid, String name, String description) {
        this.cid = cid;
        this.name = name;
        this.description = description;

    }
    public Course(){}
    @Override
    public String toString() {
        return "Course{" +
                "cid=" + cid +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (getCid() != course.getCid()) return false;
        if (!getName().equals(course.getName())) return false;
        return getDescription().equals(course.getDescription());

    }

    @Override
    public int hashCode() {
        int result = getCid();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDescription().hashCode();
        return result;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
