//package com.husseinabdallah.SpringBootMasterClass.ioc;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import com.fasterxml.jackson.databind.ObjectWriter;
//import com.husseinabdallah.SpringBootMasterClass.entity.Student;
//import com.husseinabdallah.SpringBootMasterClass.repository.StudentRepository;
//import lombok.Data;
//import org.springframework.beans.factory.annotation.Value;
//
//import java.util.List;
//
//
//public class Student1 {
//    // Class data members
//    private final int id;
//    private final MathCheat mathCheat;
//
//    // Constructor of Student class
//    public Student1(int id, MathCheat mathCheat) {
//        this.id = id;
//        this.mathCheat = mathCheat;
//    }
//
//    // Method
//    public void cheating() {
//        System.out.println("My ID is: " + id);
//        mathCheat.mathCheating();
//    }
//}
//
//class Main {
//    public static void main(String[] args) throws JsonProcessingException {
////        Student1 student1 = new Student1(1, new MathCheat());
////        student1.cheating();
////
////        System.out.println(student1);
//
//        StudentRepository studentRepository = new StudentRepository();
//        studentRepository.save(new Student(1L, "Anshul", 25));
//        studentRepository.save(new Student(2L, "Abdallah", 25));
//
//        Student student = studentRepository.findStudentById(2L);
//
//        List<Student> students = studentRepository.findAllStudents();
//        System.out.println(students);
//
//
//        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
//        String jsonStudents = ow.writeValueAsString(students);
//        String jsonStudent = ow.writeValueAsString(student);
//
//        System.out.println(jsonStudent);
//        System.out.println(jsonStudents);
//
//    }
//}
