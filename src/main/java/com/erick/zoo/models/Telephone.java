package com.erick.zoo.models;

import javax.persistence.*;

@Entity
@Table(name = "telephone")
public class Telephone extends Auditor {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;
    private String phonetype;
    private String phonenumber;



    @ManyToOne
    @JoinColumn(name = "zooid", nullable = false)
    private Zoo zooid;

    public Telephone() {
    }

    public Telephone(long phoneid, String phonetype, String phonenumber, Zoo zooid) {
        this.phoneid = phoneid;
        this.phonetype = phonetype;
        this.phonenumber = phonenumber;
        this.zooid = zooid;
    }

    public long getPhoneid() {
        return phoneid;
    }

    public void setPhoneid(long phoneid) {
        this.phoneid = phoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Zoo getZooid() {
        return zooid;
    }

    public void setZooid(Zoo zooid) {
        this.zooid = zooid;
    }
}
