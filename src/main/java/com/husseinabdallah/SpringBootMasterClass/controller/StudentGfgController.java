package com.husseinabdallah.SpringBootMasterClass.controller;


import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfg;
import com.husseinabdallah.SpringBootMasterClass.entity.StudentGfgDetail;
import com.husseinabdallah.SpringBootMasterClass.service.StudentGfgDetailService;
import com.husseinabdallah.SpringBootMasterClass.service.StudentGfgService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/v1/student")
public class StudentGfgController {

    private final StudentGfgService studentGfgService;
    private final StudentGfgDetailService studentGfgDetailService;

    public StudentGfgController (
            StudentGfgService studentGfgService,
            StudentGfgDetailService studentGfgDetailService
    ){
        this.studentGfgService = studentGfgService;
        this.studentGfgDetailService = studentGfgDetailService;
    }

    @PostMapping(path = "/createStudent", consumes = "application/json", produces = "application/json")
    public StudentGfg createStudentGfg(@RequestBody StudentGfg studentGfg) {
        System.out.println(studentGfg.toString());
        return studentGfgService.createStudent(studentGfg);
    }


    @GetMapping(path = "/getStudentGfgDetail", produces = "application/json")
    public Optional<StudentGfgDetail> getStudentGfgDetail(@RequestParam(name = "id") Long id) {
        System.out.println(id);
        return studentGfgDetailService.getStudentGfgDetail(id);
    }

    @GetMapping(path = "/getStudentGfg", produces = "application/json")
    public Optional<StudentGfg> getStudentGfg(@RequestParam(name = "id") Long id) {
        System.out.println(id);
        return studentGfgService.getStudentGfg(id);
    }

}
