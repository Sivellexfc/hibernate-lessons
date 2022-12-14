package org.example;

import entity.Product;
import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Date;

public class ProductTest {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Product laptop = new Product("Laptop",12560,2,new Date());
        Product kanepe = new Product("Koltuk",1880,3,new Date());
        Product lamba = new Product("Avize",2560,5,new Date());
        Product kitap = new Product("Kitap",60,12,new Date());
        Product araba = new Product("Renault",297560,1,new Date());
        Product kalem = new Product("Uçlu kalem",8,1400,new Date());
        Product tshirt = new Product("Tshirt",75,120,new Date());
        Product shoe = new Product("Ayakkabı",560,4,new Date());

        User satici = new User("Musluhan","Cavus",new Date());
        User satici2 = new User("Jeff","Bezos",new Date());

        laptop.setUser(satici);
        kanepe.setUser(satici);
        lamba.setUser(satici);
        araba.setUser(satici);
        tshirt.setUser(satici);
        kitap.setUser(satici2);
        kalem.setUser(satici2);
        shoe.setUser(satici2);

        entityManager.getTransaction().begin();

        entityManager.persist(laptop);
        entityManager.persist(kanepe);
        entityManager.persist(lamba);
        entityManager.persist(araba);
        entityManager.persist(tshirt);
        entityManager.persist(kitap);
        entityManager.persist(kalem);
        entityManager.persist(shoe);


        entityManager.getTransaction().commit();

        //System.out.println(entityManager.find(User.class,2));

    }
}
