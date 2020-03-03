package com.openshift.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.openshift.model.Employee;
 
 
@Repository
public interface Employeedao extends MongoRepository<Employee, Integer> {
 
}
