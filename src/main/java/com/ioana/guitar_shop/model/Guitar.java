package com.ioana.guitar_shop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="guitars")
public class Guitar {

    @Id
    @Column(name="serialNumber", unique = true, columnDefinition = "VARCHAR(64)", nullable = false)
    private String serialNumber;

    @Column(name="builder", nullable = false)
    private String builder;

    @Column(name="model", nullable = false)
    private String model;

    @Column(name="type", nullable = false)
    private String type;

    @Column(name="backwood", nullable = false)
    private String backWood;

    @Column(name="topWood", nullable = false)
    private String topWood;

    @Column(name="price", nullable = false)
    private double price;

    @Column(name="image")
    private String imgURL;


    public Guitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price, String imgURL) {
        this.serialNumber = serialNumber;
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.price = price;
        this.imgURL = imgURL;
    }

    public Guitar() {
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
