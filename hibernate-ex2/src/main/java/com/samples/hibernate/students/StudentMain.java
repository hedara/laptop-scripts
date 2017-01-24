package com.samples.hibernate.students;

import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by edara on 8/20/16.
 */
public class StudentMain {
    public static SessionFactory sessionFactory;
    public static Logger logger = LoggerFactory.getLogger(StudentMain.class);
    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        insertTestData();
    }

    public static List<Student> getTestData() {
        Course course1 = new Course(101,"I101","Introduction class");
        Course course2 = new Course(102,"I102","Introduction class 2");
        Course course3 = new Course(103,"I103","Introduction class 3");
        Student student1 = new Student(1001,"hareen");
        Student student2 = new Student(1002,"laxmi");
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course1);
        student2.addCourse(course3);
        List<Student> students = new ArrayList<Student>();
        students.add(student1);
        //students.add(student2);
        return students;
    }

    public static void insertTestData() {
        List<Student> students = getTestData();
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        try{

            for(Student student: students){
                session.save(student);
            }
            tx.commit();
        }catch(Exception ex) {
            if(tx !=null)
                tx.rollback();
        }finally{
            session.close();
            sessionFactory.close();
        }

    }

}
