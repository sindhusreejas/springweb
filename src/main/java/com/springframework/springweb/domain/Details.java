package com.springframework.springweb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
public class Details {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    private int cost;
    private String soldIn;

    @ManyToMany
    @JoinTable(name = "author_details", joinColumns = @JoinColumn(name = "book_id"), inverseJoinColumns = @JoinColumn(name = "details_id"))
    private List<Author> authors = new ArrayList<>();

    public Details(int cost, String soldIn) {
        this.cost = cost;
        this.soldIn = soldIn;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getSoldIn() {
        return soldIn;
    }

    public void setSoldIn(String soldIn) {
        this.soldIn = soldIn;
    }
}
