package com.app.dao;

import java.util.List;

public interface IDataModelDao<T, ID> {

    Integer save(T t);

    void delete(ID id);

    void update(T t, ID id);

    T findOne(ID id);

    List<T> findAll();

}
