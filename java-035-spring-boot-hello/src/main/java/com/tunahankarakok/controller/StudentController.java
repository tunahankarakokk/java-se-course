package com.tunahankarakok.controller;

import com.tunahankarakok.model.Student;
import com.tunahankarakok.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//   http://localhost:8090/api/v1

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    //Controller dediğimiz şey bir servisi çağırır

    //DEPENDENCY INJECTION - Bağımlılıkların Enjeksiyonu
    //INVERSION OF CONTROL IoC: Kontrolü Springe ver.


    //Servis Enjekte Ediliyor.... Eski
   /*
    @Autowired
    StudentService studentService;
*/

    // the StudentController has a dependency on a MovieFinder
    private final StudentService studentService;

    // a constructor so that the Spring container can inject a MovieFinder
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }





    // GET

    //   http://127.0.0.1:8090/api/v1/hello
    //   http://localhost:8090/api/v1/hello
    @GetMapping("/hello")
    public String hello() {
        return "Hello Spring Boot - Student Controller ";
    }



    //API
    //GET - SELECT ALL
    //   http://localhost:8090/api/v1/students                  //v1
    //   http://localhost:8090/api/v1/student/all               //v2
    @GetMapping({"/students","/student/all"})
    public List<Student> getStudents(){
        return studentService.getStudents();
    }


    //GET - SELECT WHERE
    //
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable (name = "id") Long id){
        return studentService.getStudent(id);
    }

    //POST  - INSERT
    //   http://localhost:8090/api/v1/student
    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }



    //PUT   - UPDATE
    //   http://localhost:8090/api/v1/student/1
    @PutMapping("/student/{id}")
    public Optional<Student> updateStudent(@PathVariable Long id,
                                 @RequestBody Student student){

        //FIXME servis katmanına bu bölüm taşınacak
        //id değeri veritabanında var mı yok mu?

        Student studentInfo = studentService.getStudent(id);
        if(studentInfo == null){
            return Optional.empty();
        }
        else{
            student.setId(id);
        }
/*
        studentInfo.setId(id);
        studentInfo.setFirstName(student.getFirstName());
        studentInfo.setLastName(student.getLastName());
        studentInfo.setEmail(student.getEmail());
*/
        return studentService.updateStudent(student);
    }

    //DELETE - DELETE
    //   http://localhost:8090/api/v1/student/1
    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable Long id){
        return studentService.deleteStudent(id);
    }

}
