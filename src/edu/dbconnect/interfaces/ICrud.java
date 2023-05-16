package edu.dbconnect.interfaces;

import java.util.List;

public interface ICrud<T> {
    void addEntity(T t);
    List<T> displayEntities();
}


