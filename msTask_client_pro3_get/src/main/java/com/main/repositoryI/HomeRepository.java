package com.main.repositoryI;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.main.model.Student;
@Repository
public interface HomeRepository extends CrudRepository<Student, Integer>  {

}
