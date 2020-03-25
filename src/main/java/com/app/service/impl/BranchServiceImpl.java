package com.app.service.impl;

import com.app.dao.IDataModelDao;
import com.app.model.Branch;
import com.app.service.IDataModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class BranchServiceImpl implements IDataModelService<Branch, Integer> {

    @Autowired
    private IDataModelDao<Branch, Integer> dao;

    @Transactional
    @Override
    public Integer save(Branch branch) {
        return dao.save(branch);
    }

    @Transactional
    @Override
    public void delete(Integer id) {
        dao.delete(id);
    }

    @Transactional
    @Override
    public void update(Branch branch, Integer id) {
        dao.update(branch, id);
    }

    @Transactional(readOnly = true)
    @Override
    public Branch findOne(Integer id) {
        return dao.findOne(id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Branch> findAll() {
        return dao.findAll();
    }
}
