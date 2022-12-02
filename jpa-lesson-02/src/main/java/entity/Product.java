package entity;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private double unitPrice;
    private int available;
    private Date addDate;

    @ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "userID")
    private User user;

    public Product() {
    }

    public Product(String productName, double unitPrice, int available, Date addDate) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.available = available;
        this.addDate = addDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", unitPrice=" + unitPrice +
                ", available=" + available +
                ", addDate=" + addDate +
                '}';
    }
}
