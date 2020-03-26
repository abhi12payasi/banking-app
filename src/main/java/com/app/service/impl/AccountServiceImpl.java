package com.app.service.impl;

import com.app.dao.IDataModelDao;
import com.app.model.Account;
import com.app.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class AccountServiceImpl implements IDataModelService<Account, Integer> {
    @Autowired
    private IDataModelDao<Account, Integer> dao;

    @Transactional
    @Override
    public Integer save(Account account) {
        return dao.save(account);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    @Transactional
    @Override
    public void update(Account account, Integer id) {
        dao.update(account, id);
    }

    @Transactional(readOnly = true)
    @Override
    public Account findOne(Integer id) {
        return dao.findOne(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Account> findAll() {
        return dao.findAll();
    }
}

