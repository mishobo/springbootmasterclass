package com.husseinabdallah.SpringBootMasterClass.repository;

import java.util.List;

public interface DemoRepository<T> {

    // Save method
    public void save(T t);

    // Find a student by its id
    public T findStudentById(Long id);

    List<T> findAllStudents();


}
