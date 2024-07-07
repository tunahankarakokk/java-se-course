package com.tunahankarakok.controller;

import com.tunahankarakok.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//   http://localhost:8090/api/v1

@RestController
@RequestMapping("/api/v1")
public class StudentController {


    // GET

    //   http://127.0.0.1:8090/api/v1/hello
    //   http://localhost:8090/api/v1/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot - Student Controller ";
    }

}
