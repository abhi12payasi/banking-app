package com.app.dao.impl;

import com.app.dao.IDataModelDao;
import com.app.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BranchDaoImpl implements IDataModelDao<Branch, Integer> {

    @Autowired
    private HibernateTemplate ht;

    @Override
    public Integer save(Branch branch) {
        return (Integer) ht.save(branch);
    }

    @Override
    public void delete(Integer id) {
        ht.delete(id);
    }

    @Override
    public void update(Branch branch, Integer id) {
        branch.setId(id);
        ht.update(branch);
    }

    @Override
    public Branch findOne(Integer id) {
        return ht.get(Branch.class, id);
    }

    @Override
    public List<Branch> findAll() {
        return ht.loadAll(Branch.class);
    }
}
