package com.myprojects.cvproject1.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "name")
    String name;

    @Column(name = "status")
    Long status;


    @OneToMany(mappedBy="category",fetch = FetchType.LAZY)
    Collection<Product> products;
}
