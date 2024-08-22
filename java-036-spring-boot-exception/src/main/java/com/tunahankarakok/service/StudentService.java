package com.tunahankarakok.service;

import com.tunahankarakok.model.Student;
import com.tunahankarakok.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {

    /*
    @Autowired
    private StudentRepository studentRepository;
    */
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    /*
    getAllStudent
    getOneStudent
    createStudent
    deleteStudent
    updateStudent
     */
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    public Student getOneStudent(Long id) {
        //return studentRepository.findById(id).get();
        return studentRepository.getReferenceById(id);
    }

    public Student createStudent(Student student) {//ekleneni göster diye metodun türü Student eğer eklendi yazısı gelse String eğer eklendi eklenmedi evet hayır olsa boolean olurdu
        return studentRepository.save(student);
    }

    public Map<String, Boolean> deleteStudent(Long id) {
        studentRepository.deleteById(id);
        Map<String, Boolean> deleteResult = new HashMap<>();
        deleteResult.put("Deleted info ID : " + id, Boolean.TRUE);
        return deleteResult;
    }




    public Student updateStudent(Long id,Student student) {
        student.setId(id);
        return studentRepository.save(student);
    }

}
