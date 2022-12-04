package Entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Brand implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int brandId;
    @Column(name = "BrandName")
    private String brandName;

    @OneToMany(mappedBy = "brand")
    private List<Product> productList;

    public Brand() {
    }

    public Brand(String brandName) {
        this.brandName = brandName;

    }

    public int getBrandId() {
        return brandId;
    }

    public void setBrandId(int brandId) {
        this.brandId = brandId;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Brand{" +
                "brandId=" + brandId +
                ", brandName='" + brandName + '\'' +
                ", productList=" + productList +
                '}';
    }
}
