package com.zeroslope.infrastructure.base;

import java.util.ArrayList;

public interface BaseService<T> {

    ArrayList<T> list();

    T read(long id);

    T save(T model);
    
    void delete(long id);

    void delete(T model);

}