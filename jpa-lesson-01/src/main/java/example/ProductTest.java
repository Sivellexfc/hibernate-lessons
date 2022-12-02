package example;

import entity.Product;
import entity.User;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

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
        User satici2 = new User("Mert","Osman",new Date());

        List<Product> satici2Products = Arrays.asList(araba,kalem,tshirt,shoe);
        List<Product> saticiProducts = Arrays.asList(lamba,laptop,kanepe,kitap);

        satici.setProductList(saticiProducts);
        satici2.setProductList(satici2Products);

        entityManager.getTransaction().begin();

        entityManager.persist(satici);
        entityManager.persist(satici2);

        entityManager.getTransaction().commit();

        System.out.println(entityManager.find(User.class,2));

    }
}
