package com.tunahankarakok.repository;

import com.tunahankarakok.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository//--buranın Repository olduğunu springe söylemek için kullanılır

public interface StudentRepository extends JpaRepository<Student, Long> {
//ihtiyacım kadar metodu kullanmak için interface i miras alırız.
                                                        // <Hangi modele göre gideceğimi söylüyorum(Student),
                                                        //,<, Id değerini değişken türü yazılır(Long)>

//db , dao database için database işlemleri burada yapılır


}
