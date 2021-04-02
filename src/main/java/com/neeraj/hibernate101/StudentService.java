package com.neeraj.hibernate101;

import org.springframework.beans.factory.annotation.Autowired;
import com.neeraj.hibernate101.dao.StudentRepository;

/**
 * @author neerajgupta
 * @since 02/04/21
 */
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
}
