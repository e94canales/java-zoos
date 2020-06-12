package com.erick.zoo.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "zoo")
public class Zoo extends Auditor {
    @Id
    private long zooid;
    private String zooname;

    @OneToMany(mappedBy = "zooid")
    private List<Telephone> telephones = new ArrayList<>();

    @OneToMany(mappedBy = "zoo")
    private List<ZooAnimals> zoos = new ArrayList<>();


    public Zoo() {
    }

    public Zoo(long zooid, String zooname, List<Telephone> telephones, List<ZooAnimals> zoos) {
        this.zooid = zooid;
        this.zooname = zooname;
        this.telephones = telephones;
        this.zoos = zoos;
    }

    public long getZooid() {
        return zooid;
    }

    public void setZooid(long zooid) {
        this.zooid = zooid;
    }

    public String getZooname() {
        return zooname;
    }

    public void setZooname(String zooname) {
        this.zooname = zooname;
    }

    public List<Telephone> getTelephones() {
        return telephones;
    }

    public void setTelephones(List<Telephone> telephones) {
        this.telephones = telephones;
    }

    public List<ZooAnimals> getZoos() {
        return zoos;
    }

    public void setZoos(List<ZooAnimals> zoos) {
        this.zoos = zoos;
    }
}
