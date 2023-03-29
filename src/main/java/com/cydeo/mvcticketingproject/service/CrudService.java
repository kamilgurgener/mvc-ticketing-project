package com.cydeo.mvcticketingproject.service;

import java.util.List;

public interface CrudService <T, ID>{

    T save(T object);
    List<T> findAll();
    T findById(ID id);
    void deleteById(ID id);
}
