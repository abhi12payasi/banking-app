package com.app.dao.impl;

import com.app.dao.IDataModelDao;
import com.app.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDaoImpl implements IDataModelDao<Customer, Integer> {

    @Autowired
    private HibernateTemplate ht;


    @Override
    public Integer save(Customer customer) {
        return (Integer) ht.save(customer);
    }

    @Override
    public void delete(Integer id) {
        ht.delete(id);
    }

    @Override
    public void update(Customer customer, Integer id) {
        customer.setId(id);
        ht.update(customer);
    }

    @Override
    public Customer findOne(Integer id) {
        return ht.get(Customer.class, id);
    }

    @Override
    public List<Customer> findAll() {
        return ht.loadAll(Customer.class);
    }
}
