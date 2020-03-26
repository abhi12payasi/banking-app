package com.app.dao.impl;

import com.app.dao.IDataModelDao;
import com.app.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountDaoImpl implements IDataModelDao<Account,Integer> {
    @Autowired
    private HibernateTemplate ht;

    @Override
    public Integer save(Account account) {
        return (Integer)ht.save(account);
    }

    @Override
    public void delete(Integer id) {
        ht.delete(id);
    }

    @Override
    public void update(Account account, Integer id) {
        ht.update(account);
    }

    @Override
    public Account findOne(Integer id) {
        return ht.get(Account.class,id);
    }

    @Override
    public List<Account> findAll() {
        return ht.loadAll(Account.class);
    }
}
