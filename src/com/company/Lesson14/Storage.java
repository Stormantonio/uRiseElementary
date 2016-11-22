package com.company.Lesson14;


import java.io.IOException;

/**
 * Created by Anton on 16.11.2016.
 */
public interface Storage {
    //CRUD

    //create
    void save(Resume r);

    void delete(String uuid);

    //read
    Resume get(String uuid);

    void update(Resume r) throws IOException;
}
