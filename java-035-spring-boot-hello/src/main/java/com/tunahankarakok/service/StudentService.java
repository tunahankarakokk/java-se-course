package com.tunahankarakok.service;

import com.tunahankarakok.model.Student;
import com.tunahankarakok.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

//@Transactional -- bu işlerin sağlıklı yürütüldüğünden emin olmak için kullanılır
//@Component
@Service
public class StudentService {

    //Data Katmanını Enjekte Eder.
    //Yani repository enjekte etmiş oluyor.

    @Autowired
   private StudentRepository studentRepository;


    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public Student getStudent(Long id) {

        return studentRepository.findById(id).get();
        //      return studentRepository.getReferenceById(id);
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public Optional<Student> updateStudent(Student student) {
        return Optional.of(studentRepository.save(student));
    }

    public String deleteStudent(Long id) {
        Student studentInfo = studentRepository.getReferenceById(id);

        studentRepository.deleteById(id);

        //FIXME geri dönüşleri kontrol et...
        return studentInfo.getFirstName() + " " + studentInfo.getLastName() + " " + ": Başarılı Silindi";
    }
}
