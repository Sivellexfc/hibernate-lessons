package org.example;

import Entity.Department;
import Entity.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Department law = new Department("Law",450,17500);
        Department it = new Department("IT",6500,75000);
        Department food = new Department("Food",450,8700);

        Employee employee1 = new Employee("Jhon","Wick",new Date(),law);
        Employee employee2 = new Employee("Leonard","Bale",new Date(),law);
        Employee employee3 = new Employee("Christopher","Waltz",new Date(),it);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.persist(employee1);
        entityManager.persist(employee2);
        entityManager.persist(employee3);

        entityManager.getTransaction().commit();

        System.out.println(entityManager.find(Department.class,1));


    }
}