package com.app.service.impl;

import com.app.dao.IDataModelDao;
import com.app.model.Customer;
import com.app.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CustomerServiceImpl implements IDataModelService<Customer, Integer> {
    @Autowired
    private IDataModelDao<Customer, Integer> dao;

    @Transactional
    @Override
    public Integer save(Customer customer) {
        return dao.save(customer);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    @Transactional
    @Override
    public void update(Customer customer, Integer id) {
        dao.update(customer, id);
    }

    @Transactional(readOnly = true)
    @Override
    public Customer findOne(Integer id) {
        return dao.findOne(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Customer> findAll() {
        return dao.findAll();
    }
}
