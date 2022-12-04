package org.example;

import Entity.Course;
import Entity.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Course english = new Course("English");
        Course fight = new Course("Fight");
        Course javaSpring = new Course("Java Spring");

        Student osman = new Student("Osman","Gültekin",new Date(),16);
        Student mehmet = new Student("Mehmet","Gültekin",new Date(),28);
        Student ahmet = new Student("Ahmet","Gültekin",new Date(),20);
        Student furkan = new Student("Furkan","Gültekin",new Date(),23);
        Student musluhan = new Student("Musluhan","Gültekin",new Date(),21);
        Student mert = new Student("Mert","Gültekin",new Date(),26);
        Student yigit = new Student("Yiğit","Gültekin",new Date(),17);

        osman.addCourse(english);
        mehmet.addCourse(english);
        ahmet.addCourse(fight);
        ahmet.addCourse(javaSpring);
        osman.addCourse(fight);
        furkan.addCourse(english);
        furkan.addCourse(javaSpring);
        musluhan.addCourse(english);
        musluhan.addCourse(fight);
        musluhan.addCourse(javaSpring);
        mert.addCourse(english);
        mehmet.addCourse(fight);
        yigit.addCourse(javaSpring);
        yigit.addCourse(english);
        mehmet.addCourse(javaSpring);


        entityManager.getTransaction().begin();
        entityManager.persist(osman);
        entityManager.persist(mehmet);
        entityManager.persist(ahmet);
        entityManager.persist(furkan);
        entityManager.persist(musluhan);
        entityManager.persist(mert);
        entityManager.persist(yigit);
        entityManager.getTransaction().commit();

        Student result = entityManager.find(Student.class,1);
        System.out.println(result);

    }
}