package com.nimap.machinetest.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Product {

    // Getters and Setters
    @Setter
    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Setter
    @Getter
    private String name;
    private double price;

    @Setter
    @Getter
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Double getPrice(){return price;}

    public void setPrice(Double price){this.price=price;}


}
