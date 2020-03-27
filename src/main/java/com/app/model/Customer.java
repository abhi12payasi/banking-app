package com.app.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "customer_id")
    private Integer id;

    @Column(name = "customer_name")
    private String name;

    @Column(name = "customer_address")
    private String address;

    @OneToMany(targetEntity = Account.class, cascade = CascadeType.ALL,
            fetch = FetchType.LAZY , mappedBy = "customer")
    //@JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    private List<Account> accounts;


    @ManyToOne
    @JoinColumn(name = "branch_id")
    private Branch branch;

    public Customer() {
    }

    public Customer(Integer id, String name, String address, List<Account> accounts) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.accounts = accounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
