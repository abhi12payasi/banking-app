package com.app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "branch")
public class Branch implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "branch_id")
    private Integer id;

    @Column(name = "branch_code")
    private String code;

    @Column(name = "branch_name")
    private String name;

    @Column(name = "branch_location")
    private String location;

    @Column(name = "branch_city")
    private String city;

    @OneToMany
    @JoinColumn(name = "branch_id")
    private List<Customer> customers; // mapping from

    public Branch() {
    }

    public Branch(Integer id, String code, String name, String location, String city) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.location = location;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
