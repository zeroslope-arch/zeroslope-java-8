package com.zeroslope.infrastructure.base;

import java.util.ArrayList;

public interface BaseRepository<T> {

    ArrayList<T> list();

    T read(long id);

    T create(T model);

    T update(T model);
    
    void delete(long id);

}