package com.erick.zoo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "animal")
public class Animal extends Auditor {
    @Id
    private long animalid;
    private String animaltype;


    @OneToMany(mappedBy = "animal")
    private List<ZooAnimals> animals = new ArrayList<>();

    public Animal() {
    }

    public Animal(long animalid, String animaltype, List<ZooAnimals> animals) {
        this.animalid = animalid;
        this.animaltype = animaltype;
        this.animals = animals;
    }

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getAnimaltype() {
        return animaltype;
    }

    public void setAnimaltype(String animaltype) {
        this.animaltype = animaltype;
    }

    public List<ZooAnimals> getAnimals() {
        return animals;
    }

    public void setAnimals(List<ZooAnimals> animals) {
        this.animals = animals;
    }
}
