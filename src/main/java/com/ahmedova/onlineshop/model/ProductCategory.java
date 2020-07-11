package com.ahmedova.onlineshop.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "productCategory")
public class ProductCategory {

    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String description;

    @ManyToMany
    @JoinTable(
            name = "feature_packages_features",
            joinColumns = @JoinColumn(name = "feature_package_id"),
            inverseJoinColumns = @JoinColumn(name = "feature_id")
    )
    private Set<Product> product = new HashSet<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
