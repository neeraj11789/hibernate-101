package com.neeraj.hibernate101.dao;

import org.springframework.data.repository.CrudRepository;
import com.neeraj.hibernate101.domain.Laptop;
import com.neeraj.hibernate101.domain.Student;

/**
 * @author neerajgupta
 * @since 02/04/21
 */
public interface LaptopRepository extends CrudRepository<Laptop, Long> {

    Student findById(long id);

}
