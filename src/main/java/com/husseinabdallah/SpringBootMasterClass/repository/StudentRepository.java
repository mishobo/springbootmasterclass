package com.husseinabdallah.SpringBootMasterClass.repository;

import com.husseinabdallah.SpringBootMasterClass.entity.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentRepository implements DemoRepository<Student> {

    // Using an in-memory Map
    // to store the object data
    private final Map<Long, Student> repository;

    public StudentRepository() {
        this.repository = new HashMap<>();
    }

    @Override
    public void save(Student student) {
        repository.put(student.getId(), student);
    }

    @Override
    public Student findStudentById(Long id) {
        return repository.get(id);
    }

    @Override
    public List<Student> findAllStudents() {
        return repository.values().stream().toList();
    }
}
