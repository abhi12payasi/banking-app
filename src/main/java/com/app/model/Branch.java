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

    @Column(name = "branch_city")
    private String city;

    @OneToMany(targetEntity = Customer.class, cascade = CascadeType.ALL,
            fetch = FetchType.LAZY , mappedBy = "branch")
    //@JoinColumn(name = "branch_id", referencedColumnName = "branch_id")
    private List<Customer> customers;

    public Branch() {
    }

    public Branch(Integer id, String code, String name, String city, List<Customer> customers) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.city = city;
        this.customers = customers;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "Branch{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", customers=" + customers +
                '}';
    }
}
