package com.wcci.amazon.b4.virtualpet;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity(name = "VirtualPet")
@Table(name = "VirtualPet")
public class VirtualPet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int hunger;
    private int thirst;
    private int boredom;
    public VirtualPet() {
    }
    public VirtualPet(Long id) {
        this.id = id;
    }
    public VirtualPet(Long id, String name,String description, int hunger, int thirst, int boredom) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
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
    public int getHunger() {
        return hunger;
    }
    public void setHunger(int hunger) {
        this.hunger = hunger;
    }
    public int getThirst() {
        return thirst;
    }
    public void setThirst(int thirst) {
        this.thirst = thirst;
    }
    public int getBoredom() {
        return boredom;
    }
    public void setBoredom(int boredom) {
        this.boredom = boredom;
    }
}
