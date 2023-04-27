package com.crud.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.CRUD.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
