package example;

import entity.Kisi;
import entity.Parmakizi;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("TestPersistence");
        EntityManager entityManager = factory.createEntityManager();

        Kisi kisi = new Kisi();
        kisi.setName("jhon");
        Parmakizi parmakizi = new Parmakizi();
        parmakizi.setDosyaNo("282HMSKD");
        kisi.setParmakizi(parmakizi);

        Kisi kisi2 = new Kisi();
        kisi2.setName("jerry");
        Parmakizi parmakizi2 = new Parmakizi();
        parmakizi2.setDosyaNo("84N4MTK4");
        kisi2.setParmakizi(parmakizi2);

        entityManager.getTransaction().begin();

        entityManager.persist(kisi);
        entityManager.persist(parmakizi);
        entityManager.persist(kisi2);
        entityManager.persist(parmakizi2);

        entityManager.getTransaction().commit();

        System.out.println(entityManager.find(Parmakizi.class,1));

    }
}