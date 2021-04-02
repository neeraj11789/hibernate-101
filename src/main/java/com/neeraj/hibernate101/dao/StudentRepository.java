package com.neeraj.hibernate101.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.neeraj.hibernate101.domain.Student;

/**
 * @author neerajgupta
 * @since 02/04/21
 */
public interface StudentRepository extends CrudRepository<Student, Long> {

//    List<Student> findByLastName(String lastName);

    Student findById(long id);
}