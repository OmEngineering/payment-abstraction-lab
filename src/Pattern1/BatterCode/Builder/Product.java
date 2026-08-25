package Pattern1.BatterCode.Builder;

import java.util.List;

public class Product {

    private String name;

    private String desc;

    private int price;

    private String brand;

    private String category;

    private int discount;

    private String createdAt;

    private String updatedAt;

    private List<String> images;

    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    Product(Builder b) {
        if (b.getPrice() > 0) {
            this.price = b.getPrice();
        }
        this.name = b.getName();
        //...
    }
}
