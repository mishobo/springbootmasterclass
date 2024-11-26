package com.husseinabdallah.SpringBootMasterClass.controller;


import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfg;
import com.husseinabdallah.SpringBootMasterClass.service.StudentGfgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentGfgController {

    private final StudentGfgService studentGfgService;

    public StudentGfgController (StudentGfgService studentGfgService){
        this.studentGfgService = studentGfgService;
    }

    @PostMapping(path = "/createStudent", consumes = "application/json", produces = "application/json")
    public StudentGfg createStudentGfg(@RequestBody StudentGfg studentGfg) {
        System.out.println(studentGfg.toString());
        return studentGfgService.createStudent(studentGfg);
    }

}
