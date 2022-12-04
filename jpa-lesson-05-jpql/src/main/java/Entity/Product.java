package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Product implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    @Column(name = "ProductName")
    private String name;
    @Column(name = "ProductUnitPrice")
    private double unitPrice;
    @Column(name = "Available")
    private int available;
    @Temporal(TemporalType.DATE)
    private Date addDate;
    private Date updateDate;
    @ManyToOne
    @JoinColumn(name = "CategoryID")
    private Category category;
    @ManyToOne
    @JoinColumn(name = "BrandID")
    private Brand brand;

    public Product() {
    }

    public Product(String name, double unitPrice, int available, Date addDate,Category category,Brand brand) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.available = available;
        this.addDate = addDate;
        this.category = category;
        this.brand = brand;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", available=" + available +
                ", category=" + category +
                ", brand=" + brand +
                '}';
    }
}
