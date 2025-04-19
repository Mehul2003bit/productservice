package com.productserviceapi.models;

import org.springframework.web.bind.annotation.SessionAttributes;

public class Product {
    private String title;
    private long id;
    private double price;
    private Category category;
    private String description; 

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    public Category getCategory() { return category; }
    public void setCategory(Category category) { this.category = category; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

}
